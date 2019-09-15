package assignment2.issueresolver;

import java.util.ArrayList;
import java.util.List;

/* IssueHandler represents the body of the program,
 * and all issues are assigned from here
 */
public class IssueHandler {
    private final int LEVELS = 3;
    private final int numStudentAssistants;
    private final int numProfessors;
    private final int numHeadOfTheDepartment;
    private List<StudentAssistant> StudentAssistantsQ = new ArrayList<>();
    private List<Professor> ProfessorQ = new ArrayList<>();
    private List<HeadOfTheDepartment> HeadOfTheDepartmentQ = new ArrayList<>();

    private List<StudentAssistant> StudentAssistants = new ArrayList<>();
    private List<Professor> Professors = new ArrayList<>();
    private List<HeadOfTheDepartment> HeadOfTheDepartments = new ArrayList<>();


    public int getQueueSize(Faculty emp) {
        if (emp instanceof StudentAssistant)
            return getStudentAssistantsQ().size();
        if (emp instanceof Professor)
            return getProfessorQ().size();
        return getHeadOfTheDepartmentQ().size();
    }

    public IssueHandler(int numStudentAssistants, int numProfessors, int numHeadOfTheDepartment) {
        this.numStudentAssistants = numStudentAssistants;
        this.numProfessors = numProfessors;
        this.numHeadOfTheDepartment = numHeadOfTheDepartment;
    }

    /*
     * Allocate the issue to an available faculty who meets the required rank for the issue, or wait in the appropriate queue
     */
    public void allocateIssue(Issue issue) {
        if (issue.getRank().getValue() == 0) {
            StudentAssistant a = new StudentAssistant(this);
            issue.setHandler(a);
        } else if (issue.getRank().getValue() == 1) {

        } else {

        }
    }

    /*
     * An faculty just has become free after finishing handling an issue.  Return
     * true if we were able to assign a new issue, false otherwise.
     */
    public boolean assignCall(Faculty emp) {
        return emp.isFree();
    }

    public void setStudentAssistantsQ(List<StudentAssistant> studentAssistantsQ) {
        StudentAssistantsQ = studentAssistantsQ;
    }

    public List<Professor> getProfessorQ() {
        return ProfessorQ;
    }

    public void setProfessorQ(List<Professor> professorQ) {
        ProfessorQ = professorQ;
    }

    public List<HeadOfTheDepartment> getHeadOfTheDepartmentQ() {
        return HeadOfTheDepartmentQ;
    }

    public void setHeadOfTheDepartmentQ(List<HeadOfTheDepartment> headOfTheDepartmentQ) {
        HeadOfTheDepartmentQ = headOfTheDepartmentQ;
    }

    public List<StudentAssistant> getStudentAssistantsQ() {
        return StudentAssistantsQ;
    }

    public int getNumStudentAssistants() {
        return numStudentAssistants;
    }

    public int getNumProfessors() {
        return numProfessors;
    }

    public int getNumHeadOfTheDepartment() {
        return numHeadOfTheDepartment;
    }
}
