/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTSOperationRecordsRequest extends RpcAcsRequest<QueryTSOperationRecordsResponse> {
	   

	private String searchKey;

	private String startTime;

	private String operator;

	private String operationResult;

	private Long pageSize;

	private String endTime;

	private Long currentPage;

	private String instanceId;

	private String operation;

	private String operationTarget;
	public QueryTSOperationRecordsRequest() {
		super("SOFA", "2019-08-15", "QueryTSOperationRecords", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchKey() {
		return this.searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
		if(searchKey != null){
			putBodyParameter("SearchKey", searchKey);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public String getOperationResult() {
		return this.operationResult;
	}

	public void setOperationResult(String operationResult) {
		this.operationResult = operationResult;
		if(operationResult != null){
			putBodyParameter("OperationResult", operationResult);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putBodyParameter("Operation", operation);
		}
	}

	public String getOperationTarget() {
		return this.operationTarget;
	}

	public void setOperationTarget(String operationTarget) {
		this.operationTarget = operationTarget;
		if(operationTarget != null){
			putBodyParameter("OperationTarget", operationTarget);
		}
	}

	@Override
	public Class<QueryTSOperationRecordsResponse> getResponseClass() {
		return QueryTSOperationRecordsResponse.class;
	}

}
