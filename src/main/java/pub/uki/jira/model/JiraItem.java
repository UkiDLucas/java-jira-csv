package pub.uki.jira.model;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by ukilucas on 5/17/16.
 * This Model Object represents (my) common set of fields exported from JIRA into CSV file.
 */
public class JiraItem {

    private String Sprint;
    private String IssueType;
    private String Key;
    private String[] Components;
    private String Summary;
    private String Assignee;
    private String Priority;
    private String Status;
    private Float StoryPoints; // normally they are integers, but I want to be flexible
    private String[] Labels;
    private String EpicLink;
    private Date Created;
    private int SumOriginalEstimateHr;
    private int SumRemainingEstimateHr;

    public String getSprint() {
        return Sprint;
    }

    public void setSprint(String sprint) {
        Sprint = sprint;
    }

    public String getIssueType() {
        return IssueType;
    }

    public void setIssueType(String issueType) {
        IssueType = issueType;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String[] getComponents() {
        return Components;
    }

    public void setComponents(String[] components) {
        Components = components;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getAssignee() {
        return Assignee;
    }

    public void setAssignee(String assignee) {
        Assignee = assignee;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Float getStoryPoints() {
        return StoryPoints;
    }

    public void setStoryPoints(Float storyPoints) {
        StoryPoints = storyPoints;
    }

    public String[] getLabels() {
        return Labels;
    }

    public void setLabels(String[] labels) {
        Labels = labels;
    }

    public String getEpicLink() {
        return EpicLink;
    }

    public void setEpicLink(String epicLink) {
        EpicLink = epicLink;
    }

    public Date getCreated() {
        return Created;
    }

    public void setCreated(Date created) {
        Created = created;
    }

    public int getSumOriginalEstimateHr() {
        return SumOriginalEstimateHr;
    }

    public void setSumOriginalEstimateHr(int sumOriginalEstimateHr) {
        SumOriginalEstimateHr = sumOriginalEstimateHr;
    }

    public int getSumRemainingEstimateHr() {
        return SumRemainingEstimateHr;
    }

    public void setSumRemainingEstimateHr(int sumRemainingEstimateHr) {
        SumRemainingEstimateHr = sumRemainingEstimateHr;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("JiraItem{");
        sb.append("Sprint='").append(Sprint).append('\'');
        sb.append(", IssueType='").append(IssueType).append('\'');
        sb.append(", Key='").append(Key).append('\'');
        sb.append(", Components=").append(Components == null ? "null" : Arrays.asList(Components).toString());
        sb.append(", Summary='").append(Summary).append('\'');
        sb.append(", Assignee='").append(Assignee).append('\'');
        sb.append(", Priority='").append(Priority).append('\'');
        sb.append(", Status='").append(Status).append('\'');
        sb.append(", StoryPoints=").append(StoryPoints);
        sb.append(", Labels=").append(Labels == null ? "null" : Arrays.asList(Labels).toString());
        sb.append(", EpicLink='").append(EpicLink).append('\'');
        sb.append(", Created=").append(Created);
        sb.append(", SumOriginalEstimateHr=").append(SumOriginalEstimateHr);
        sb.append(", SumRemainingEstimateHr=").append(SumRemainingEstimateHr);
        sb.append('}');
        return sb.toString();
    }


}
