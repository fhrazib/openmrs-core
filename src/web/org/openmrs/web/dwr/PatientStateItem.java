package org.openmrs.web.dwr;

import java.util.Date;

import org.openmrs.PatientState;
import org.openmrs.api.context.Context;

public class PatientStateItem {

	private Integer patientStateId;
	private Integer programWorkflowId;
	private String stateName;
	private String workflowName;
	private Date startDate;
	private Date endDate;
	
	public PatientStateItem() { }
	
	public PatientStateItem(Context context, PatientState s) {
		patientStateId = s.getPatientStateId();
		programWorkflowId = s.getState().getProgramWorkflow().getProgramWorkflowId();
		stateName = s.getState().getConcept().getName(context.getLocale(), false).getName();
		workflowName = s.getState().getProgramWorkflow().getConcept().getName(context.getLocale(), false).getName();
		startDate = s.getStartDate();
		endDate = s.getEndDate();
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getPatientStateId() {
		return patientStateId;
	}

	public void setPatientStateId(Integer patientStateId) {
		this.patientStateId = patientStateId;
	}

	public Integer getProgramWorkflowId() {
		return programWorkflowId;
	}

	public void setProgramWorkflowId(Integer programWorkflowId) {
		this.programWorkflowId = programWorkflowId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getWorkflowName() {
		return workflowName;
	}

	public void setWorkflowName(String workflowName) {
		this.workflowName = workflowName;
	}
	
}
