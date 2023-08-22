package pidevguru.piwebapi.controllers;
import pidevguru.piwebapi.ApiCallback;
import pidevguru.piwebapi.ApiClient;
import pidevguru.piwebapi.ApiException;
import pidevguru.piwebapi.ApiResponse;
import pidevguru.piwebapi.Configuration;
import pidevguru.piwebapi.Pair;
import pidevguru.piwebapi.ProgressRequestBody;
import pidevguru.piwebapi.ProgressResponseBody;
import pidevguru.piwebapi.models.*;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculationControllerClient {
	private ApiClient apiClient;
	public CalculationControllerClient(ApiClient apiClient){
		this.apiClient = apiClient;
	}
	public ApiClient getApiClient() {
		return apiClient;
	}
	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}
	/**
	 * Returns results of evaluating the expression over the time range from the start time to the end time at a defined interval. 
	 *
	 */
	public PWATimedValues getAtIntervals(String expression, String endTime, String sampleInterval, String selectedFields, String startTime, String webId) throws ApiException {
		ApiResponse<PWATimedValues> resp = getAtIntervalsWithHttpInfo(expression, endTime, sampleInterval, selectedFields, startTime, webId);
		return resp.getData();
	}

	/**
	 * Returns results of evaluating the expression over the time range from the start time to the end time at a defined interval. (with HTTP information)
	 *
	 */
	public ApiResponse<PWATimedValues> getAtIntervalsWithHttpInfo(String expression, String endTime, String sampleInterval, String selectedFields, String startTime, String webId) throws ApiException {
		okhttp3.Call call = getAtIntervalsCall(expression, endTime, sampleInterval, selectedFields, startTime, webId,null,null);
		Type localVarReturnType = new TypeToken<PWATimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns results of evaluating the expression over the time range from the start time to the end time at a defined interval. (asynchronously)
	 *
	 */
	public okhttp3.Call getAtIntervalsAsync(String expression, String endTime, String sampleInterval, String selectedFields, String startTime, String webId, final ApiCallback<PWATimedValues> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getAtIntervalsCall(expression, endTime, sampleInterval, selectedFields, startTime, webId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAtIntervalsCall(String expression, String endTime, String sampleInterval, String selectedFields, String startTime, String webId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'expression' is set
		if (expression == null)
			throw new ApiException("Missing required parameter 'expression'");
		String localVarPath = "/calculation/intervals";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (expression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "expression", expression));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (sampleInterval != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sampleInterval", sampleInterval));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Returns the result of evaluating the expression at each point in time over the time range from the start time to the end time where a recorded value exists for a member of the expression. 
	 *
	 */
	public PWATimedValues getAtRecorded(String expression, String endTime, String selectedFields, String startTime, String webId) throws ApiException {
		ApiResponse<PWATimedValues> resp = getAtRecordedWithHttpInfo(expression, endTime, selectedFields, startTime, webId);
		return resp.getData();
	}

	/**
	 * Returns the result of evaluating the expression at each point in time over the time range from the start time to the end time where a recorded value exists for a member of the expression. (with HTTP information)
	 *
	 */
	public ApiResponse<PWATimedValues> getAtRecordedWithHttpInfo(String expression, String endTime, String selectedFields, String startTime, String webId) throws ApiException {
		okhttp3.Call call = getAtRecordedCall(expression, endTime, selectedFields, startTime, webId,null,null);
		Type localVarReturnType = new TypeToken<PWATimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns the result of evaluating the expression at each point in time over the time range from the start time to the end time where a recorded value exists for a member of the expression. (asynchronously)
	 *
	 */
	public okhttp3.Call getAtRecordedAsync(String expression, String endTime, String selectedFields, String startTime, String webId, final ApiCallback<PWATimedValues> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getAtRecordedCall(expression, endTime, selectedFields, startTime, webId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAtRecordedCall(String expression, String endTime, String selectedFields, String startTime, String webId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'expression' is set
		if (expression == null)
			throw new ApiException("Missing required parameter 'expression'");
		String localVarPath = "/calculation/recorded";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (expression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "expression", expression));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Returns the result of evaluating the expression over the time range from the start time to the end time. The time range is first divided into a number of summary intervals. Then the calculation is performed for the specified summaries over each interval. 
	 *
	 */
	public PWAItemsSummaryValue getSummary(String expression, String calculationBasis, String endTime, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String webId) throws ApiException {
		ApiResponse<PWAItemsSummaryValue> resp = getSummaryWithHttpInfo(expression, calculationBasis, endTime, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, webId);
		return resp.getData();
	}

	/**
	 * Returns the result of evaluating the expression over the time range from the start time to the end time. The time range is first divided into a number of summary intervals. Then the calculation is performed for the specified summaries over each interval. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsSummaryValue> getSummaryWithHttpInfo(String expression, String calculationBasis, String endTime, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String webId) throws ApiException {
		okhttp3.Call call = getSummaryCall(expression, calculationBasis, endTime, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, webId,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsSummaryValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns the result of evaluating the expression over the time range from the start time to the end time. The time range is first divided into a number of summary intervals. Then the calculation is performed for the specified summaries over each interval. (asynchronously)
	 *
	 */
	public okhttp3.Call getSummaryAsync(String expression, String calculationBasis, String endTime, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String webId, final ApiCallback<PWAItemsSummaryValue> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getSummaryCall(expression, calculationBasis, endTime, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, webId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSummaryCall(String expression, String calculationBasis, String endTime, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String webId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'expression' is set
		if (expression == null)
			throw new ApiException("Missing required parameter 'expression'");
		String localVarPath = "/calculation/summary";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (expression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "expression", expression));
		if (calculationBasis != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "calculationBasis", calculationBasis));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (sampleInterval != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sampleInterval", sampleInterval));
		if (sampleType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sampleType", sampleType));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (summaryDuration != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "summaryDuration", summaryDuration));
		if (summaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "summaryType", summaryType));
		if (timeType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeType", timeType));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Returns the result of evaluating the expression at the specified timestamps. 
	 *
	 */
	public PWATimedValues getAtTimes(String expression, List<String> time, String selectedFields, String sortOrder, String webId) throws ApiException {
		ApiResponse<PWATimedValues> resp = getAtTimesWithHttpInfo(expression, time, selectedFields, sortOrder, webId);
		return resp.getData();
	}

	/**
	 * Returns the result of evaluating the expression at the specified timestamps. (with HTTP information)
	 *
	 */
	public ApiResponse<PWATimedValues> getAtTimesWithHttpInfo(String expression, List<String> time, String selectedFields, String sortOrder, String webId) throws ApiException {
		okhttp3.Call call = getAtTimesCall(expression, time, selectedFields, sortOrder, webId,null,null);
		Type localVarReturnType = new TypeToken<PWATimedValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns the result of evaluating the expression at the specified timestamps. (asynchronously)
	 *
	 */
	public okhttp3.Call getAtTimesAsync(String expression, List<String> time, String selectedFields, String sortOrder, String webId, final ApiCallback<PWATimedValues> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getAtTimesCall(expression, time, selectedFields, sortOrder, webId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAtTimesCall(String expression, List<String> time, String selectedFields, String sortOrder, String webId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'expression' is set
		if (expression == null)
			throw new ApiException("Missing required parameter 'expression'");
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		String localVarPath = "/calculation/times";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (expression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "expression", expression));
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

}
