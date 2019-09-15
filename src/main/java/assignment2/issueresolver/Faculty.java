package assignment2.issueresolver;

/* Faculty is a super class for the StudentAssistant, Professor, and HeadofTheDepartment classes. It is implemented as an
 * abstract class, since there should be no reason to instantiated an Faculty type directly.
 */
abstract class Faculty {
	private Issue currentIssue = null;
	protected Rank rank;
	private IssueHandler issueHandler;

	public Faculty(IssueHandler issueHandler) {
		this.issueHandler = issueHandler;
	}

	/* Start the conversation */
	public void receiveIssue(Issue issue) {
		currentIssue = issue;
	}

	/* the issue is resolved, finish the issue take up new issue if it is avaiable*/
	public void issueCompleted() {
		this.currentIssue = null;
	}

	/* Assign a new issue to an faculty, if the faculty is free. */
	public boolean assignNewIssue() {
			return false;
	}

	/* Returns whether or not the faculty is free. */
	public boolean isFree() {
		return this.currentIssue == null;
	}

	public Rank getRank() {
		return rank;
	}
}
