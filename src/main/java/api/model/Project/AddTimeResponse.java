package api.model.Project;

import java.util.List;

public class AddTimeResponse {

  private String start;
  private boolean billable;
  private String description;
  private String projectId;
  private String taskId;
  private String end;
  private List <String> tagIds;
  private List<CustomField> customField;

  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public boolean isBillable() {
    return billable;
  }

  public void setBillable(boolean billable) {
    this.billable = billable;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public List<String> getTagIds() {
    return tagIds;
  }

  public void setTagIds(List<String> tagIds) {
    this.tagIds = tagIds;
  }

  public List<CustomField> getCustomField() {
    return customField;
  }

  public void setCustomField(List<CustomField> customField) {
    this.customField = customField;
  }
}
