/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgriffin20.ct417assignment1;

import java.util.Iterator;
import java.util.List;
import org.joda.time.*;

/**
 *
 * @author Meadhbh
 */
public class CourseProgramme {

    private String courseName;
    private List<Module> modules;
    private DateTime startdate, endDate;

    public CourseProgramme() {

    }

    public CourseProgramme(String courseName, List<Module> modules, DateTime startDate, DateTime endDate) {
        setCourseName(courseName);
        setModules(modules);
        setStartdate(startDate);
        setEndDate(endDate);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public DateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(DateTime startdate) {
        this.startdate = startdate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public String toString() {
        String moduleInfo = "";

        for (Iterator<Module> it = modules.iterator(); it.hasNext();) {
            Module module = it.next();
            moduleInfo += module.toString();
        }

        return "Course: " + courseName + ", \nModules:\n" + moduleInfo + "\nStart date: " + startdate + "\nEnd date: " + endDate;
    }
}