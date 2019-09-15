package assignment2.issueresolver;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


public class UnitTestIssueResolver{ 


	

	@Test
	public void testIssueResolver() {

			IssueHandler issueHandler = new IssueHandler(5,3,1);
			ArrayList<Issue> calls = new ArrayList<Issue>();
				int studentId = 0;
				Issue issue = allocateIssue(issueHandler, Rank.HOD, studentId);
				Faculty hodHandler1 = issue.getHandler();
				assertEquals(hodHandler1.getRank(), Rank.HOD);
				assertEquals(issueHandler.getQueueSize(hodHandler1), 0);
				
				studentId = 1;
				issue = allocateIssue(issueHandler, Rank.STUDENT_ASSISTANT, studentId);
				Faculty handler = issue.getHandler();
				assertEquals(handler.getRank(), Rank.STUDENT_ASSISTANT);
				assertEquals(issueHandler.getQueueSize(handler), 0);
				
				studentId = 2;
				issue = allocateIssue(issueHandler, Rank.STUDENT_ASSISTANT, studentId);
				handler = issue.getHandler();
				assertEquals(handler.getRank(), Rank.STUDENT_ASSISTANT);
				assertEquals(issueHandler.getQueueSize(handler), 0);
				
				studentId = 3;
				issue = allocateIssue(issueHandler, Rank.HOD, studentId);
				handler = issue.getHandler();
				//Should return null because HOD queue is full.
				assertEquals(handler, null);
				assertEquals(issueHandler.getQueueSize(handler), 1);
				
				studentId = 4;
				issue = allocateIssue(issueHandler, Rank.PROFESSOR, studentId);
				handler = issue.getHandler();
				assertEquals(handler.getRank(), Rank.PROFESSOR);
				assertEquals(issueHandler.getQueueSize(handler), 0);
				
				studentId = 5;
				issue = allocateIssue(issueHandler, Rank.STUDENT_ASSISTANT, studentId);
				handler = issue.getHandler();
				assertEquals(handler.getRank(), Rank.STUDENT_ASSISTANT);
				assertEquals(issueHandler.getQueueSize(handler), 0);
				
				//HOD is free now so check that the queue is empty.
				hodHandler1.issueCompleted();
				assertEquals(issueHandler.getQueueSize(hodHandler1), 0);
			
		}


		private static Issue allocateIssue(IssueHandler issueHandler, Rank rank, Integer studentid) {
			Issue issue = createIssue(studentid);
			issue.setRank(rank);
			issueHandler.allocateIssue(issue);
			return issue;
		}

		private static Issue createIssue(int id) {
			Student student = new Student(id, Integer.toString(id));
			Issue issue = new Issue(student);
			return issue;
		}


}
