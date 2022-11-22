package api.model.Project;

import java.util.List;

public class EditTimeResponse {

  private String id;
  private String description;
  private String userId;
  private boolean billable;
  private String taskId;
  private String projectId;
  private String workspaceId;
  private boolean isLocked;
  private String type;
  private List <String> tagIds;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public boolean isBillable() {
    return billable;
  }

  public void setBillable(boolean billable) {
    this.billable = billable;
  }

  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public String getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  public boolean isLocked() {
    return isLocked;
  }

  public void setLocked(boolean locked) {
    isLocked = locked;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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

  private List<CustomField> customField;

}
