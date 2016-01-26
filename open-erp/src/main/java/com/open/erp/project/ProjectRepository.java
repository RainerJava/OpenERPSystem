package com.open.erp.project;

/**
 * Created by thofl on 1/25/2016.
 */
public interface ProjectRepository {
    void Read(int projectId);
    void Create(Project project);
    void Update(Project project);
    void Delete(int projectId);
}
