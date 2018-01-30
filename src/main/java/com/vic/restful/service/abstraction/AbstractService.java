package com.vic.restful.service.abstraction;

import com.vic.restful.model.abstraction.IModel;

public abstract class AbstractService implements IService {

	private IModel inputData;
	
	private IModel outputData;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		getState();
		getData();
		putState();
	}
		
	public void setInputData(IModel inputData) {
		this.inputData = inputData;
		execute();
	}
	
	public IModel getOutputData() {
		return this.outputData;
	}
}
