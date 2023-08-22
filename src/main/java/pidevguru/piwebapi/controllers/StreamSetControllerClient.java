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

public class StreamSetControllerClient {
	private ApiClient apiClient;
	public StreamSetControllerClient(ApiClient apiClient){
		this.apiClient = apiClient;
	}
	public ApiClient getApiClient() {
		return apiClient;
	}
	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}
	/**
	 * Opens a channel that will send messages about any value changes for the specified streams. 
	 *
	 */
	public PWAItemsStreamValue getChannelAdHoc(List<String> webId, Integer heartbeatRate, Boolean includeInitialValues, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValue> resp = getChannelAdHocWithHttpInfo(webId, heartbeatRate, includeInitialValues, webIdType);
		return resp.getData();
	}

	/**
	 * Opens a channel that will send messages about any value changes for the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValue> getChannelAdHocWithHttpInfo(List<String> webId, Integer heartbeatRate, Boolean includeInitialValues, String webIdType) throws ApiException {
		okhttp3.Call call = getChannelAdHocCall(webId, heartbeatRate, includeInitialValues, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Opens a channel that will send messages about any value changes for the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call getChannelAdHocAsync(List<String> webId, Integer heartbeatRate, Boolean includeInitialValues, String webIdType, final ApiCallback<PWAItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getChannelAdHocCall(webId, heartbeatRate, includeInitialValues, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getChannelAdHocCall(List<String> webId, Integer heartbeatRate, Boolean includeInitialValues, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/channel";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (heartbeatRate != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "heartbeatRate", heartbeatRate));
		if (includeInitialValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeInitialValues", includeInitialValues));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns End Of Stream values for attributes of the specified streams 
	 *
	 */
	public PWAItemsStreamValues getEndAdHoc(List<String> webId, String selectedFields, String sortField, String sortOrder, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getEndAdHocWithHttpInfo(webId, selectedFields, sortField, sortOrder, webIdType);
		return resp.getData();
	}

	/**
	 * Returns End Of Stream values for attributes of the specified streams (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getEndAdHocWithHttpInfo(List<String> webId, String selectedFields, String sortField, String sortOrder, String webIdType) throws ApiException {
		okhttp3.Call call = getEndAdHocCall(webId, selectedFields, sortField, sortOrder, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns End Of Stream values for attributes of the specified streams (asynchronously)
	 *
	 */
	public okhttp3.Call getEndAdHocAsync(List<String> webId, String selectedFields, String sortField, String sortOrder, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getEndAdHocCall(webId, selectedFields, sortField, sortOrder, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getEndAdHocCall(List<String> webId, String selectedFields, String sortField, String sortOrder, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/end";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns interpolated values of the specified streams over the specified time range at the specified sampling interval. 
	 *
	 */
	public PWAItemsStreamValues getInterpolatedAdHoc(List<String> webId, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String sortField, String sortOrder, String startTime, String syncTime, String syncTimeBoundaryType, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getInterpolatedAdHocWithHttpInfo(webId, endTime, filterExpression, includeFilteredValues, interval, selectedFields, sortField, sortOrder, startTime, syncTime, syncTimeBoundaryType, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns interpolated values of the specified streams over the specified time range at the specified sampling interval. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getInterpolatedAdHocWithHttpInfo(List<String> webId, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String sortField, String sortOrder, String startTime, String syncTime, String syncTimeBoundaryType, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getInterpolatedAdHocCall(webId, endTime, filterExpression, includeFilteredValues, interval, selectedFields, sortField, sortOrder, startTime, syncTime, syncTimeBoundaryType, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns interpolated values of the specified streams over the specified time range at the specified sampling interval. (asynchronously)
	 *
	 */
	public okhttp3.Call getInterpolatedAdHocAsync(List<String> webId, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String sortField, String sortOrder, String startTime, String syncTime, String syncTimeBoundaryType, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getInterpolatedAdHocCall(webId, endTime, filterExpression, includeFilteredValues, interval, selectedFields, sortField, sortOrder, startTime, syncTime, syncTimeBoundaryType, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getInterpolatedAdHocCall(List<String> webId, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String selectedFields, String sortField, String sortOrder, String startTime, String syncTime, String syncTimeBoundaryType, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/interpolated";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (interval != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "interval", interval));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (syncTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "syncTime", syncTime));
		if (syncTimeBoundaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "syncTimeBoundaryType", syncTimeBoundaryType));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns interpolated values of the specified streams at the specified times. 
	 *
	 */
	public PWAItemsStreamValues getInterpolatedAtTimesAdHoc(List<String> time, List<String> webId, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getInterpolatedAtTimesAdHocWithHttpInfo(time, webId, filterExpression, includeFilteredValues, selectedFields, sortOrder, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns interpolated values of the specified streams at the specified times. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getInterpolatedAtTimesAdHocWithHttpInfo(List<String> time, List<String> webId, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getInterpolatedAtTimesAdHocCall(time, webId, filterExpression, includeFilteredValues, selectedFields, sortOrder, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns interpolated values of the specified streams at the specified times. (asynchronously)
	 *
	 */
	public okhttp3.Call getInterpolatedAtTimesAdHocAsync(List<String> time, List<String> webId, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getInterpolatedAtTimesAdHocCall(time, webId, filterExpression, includeFilteredValues, selectedFields, sortOrder, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getInterpolatedAtTimesAdHocCall(List<String> time, List<String> webId, String filterExpression, Boolean includeFilteredValues, String selectedFields, String sortOrder, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/interpolatedattimes";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns the base stream's recorded values and subordinate streams' interpolated values at times matching the recorded values' timestamps. 
	 *
	 */
	public PWAItemsStreamValues getJoined(String baseWebId, List<String> subordinateWebId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getJoinedWithHttpInfo(baseWebId, subordinateWebId, boundaryType, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, startTime, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns the base stream's recorded values and subordinate streams' interpolated values at times matching the recorded values' timestamps. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getJoinedWithHttpInfo(String baseWebId, List<String> subordinateWebId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getJoinedCall(baseWebId, subordinateWebId, boundaryType, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, startTime, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns the base stream's recorded values and subordinate streams' interpolated values at times matching the recorded values' timestamps. (asynchronously)
	 *
	 */
	public okhttp3.Call getJoinedAsync(String baseWebId, List<String> subordinateWebId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getJoinedCall(baseWebId, subordinateWebId, boundaryType, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, startTime, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getJoinedCall(String baseWebId, List<String> subordinateWebId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String startTime, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'baseWebId' is set
		if (baseWebId == null)
			throw new ApiException("Missing required parameter 'baseWebId'");
		// verify the required parameter 'subordinateWebId' is set
		if (subordinateWebId == null)
			throw new ApiException("Missing required parameter 'subordinateWebId'");
		String localVarPath = "/streamsets/joined";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (baseWebId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "baseWebId", baseWebId));
		if (subordinateWebId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "subordinateWebId", subordinateWebId));
		if (boundaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "boundaryType", boundaryType));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns values of attributes for the specified streams over the specified time range suitable for plotting over the number of intervals (typically represents pixels). 
	 *
	 */
	public PWAItemsStreamValues getPlotAdHoc(List<String> webId, String endTime, Integer intervals, String selectedFields, String sortField, String sortOrder, String startTime, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getPlotAdHocWithHttpInfo(webId, endTime, intervals, selectedFields, sortField, sortOrder, startTime, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns values of attributes for the specified streams over the specified time range suitable for plotting over the number of intervals (typically represents pixels). (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getPlotAdHocWithHttpInfo(List<String> webId, String endTime, Integer intervals, String selectedFields, String sortField, String sortOrder, String startTime, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getPlotAdHocCall(webId, endTime, intervals, selectedFields, sortField, sortOrder, startTime, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns values of attributes for the specified streams over the specified time range suitable for plotting over the number of intervals (typically represents pixels). (asynchronously)
	 *
	 */
	public okhttp3.Call getPlotAdHocAsync(List<String> webId, String endTime, Integer intervals, String selectedFields, String sortField, String sortOrder, String startTime, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getPlotAdHocCall(webId, endTime, intervals, selectedFields, sortField, sortOrder, startTime, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getPlotAdHocCall(List<String> webId, String endTime, Integer intervals, String selectedFields, String sortField, String sortOrder, String startTime, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/plot";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (intervals != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "intervals", intervals));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns recorded values of the specified streams. 
	 *
	 */
	public PWAItemsStreamValues getRecordedAdHoc(List<String> webId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String sortField, String sortOrder, String startTime, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getRecordedAdHocWithHttpInfo(webId, boundaryType, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, sortField, sortOrder, startTime, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns recorded values of the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getRecordedAdHocWithHttpInfo(List<String> webId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String sortField, String sortOrder, String startTime, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getRecordedAdHocCall(webId, boundaryType, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, sortField, sortOrder, startTime, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values of the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAdHocAsync(List<String> webId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String sortField, String sortOrder, String startTime, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAdHocCall(webId, boundaryType, endTime, filterExpression, includeFilteredValues, maxCount, selectedFields, sortField, sortOrder, startTime, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAdHocCall(List<String> webId, String boundaryType, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String selectedFields, String sortField, String sortOrder, String startTime, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/recorded";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (boundaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "boundaryType", boundaryType));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Updates multiple values for the specified streams. 
	 *
	 */
	public PWAItemsItemsSubstatus updateValuesAdHoc(List<PWAStreamValues> values, String bufferOption, String updateOption) throws ApiException {
		ApiResponse<PWAItemsItemsSubstatus> resp = updateValuesAdHocWithHttpInfo(values, bufferOption, updateOption);
		return resp.getData();
	}

	/**
	 * Updates multiple values for the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsItemsSubstatus> updateValuesAdHocWithHttpInfo(List<PWAStreamValues> values, String bufferOption, String updateOption) throws ApiException {
		okhttp3.Call call = updateValuesAdHocCall(values, bufferOption, updateOption,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsItemsSubstatus>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Updates multiple values for the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call updateValuesAdHocAsync(List<PWAStreamValues> values, String bufferOption, String updateOption, final ApiCallback<PWAItemsItemsSubstatus> callback) throws ApiException {
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
		okhttp3.Call call = updateValuesAdHocCall(values, bufferOption, updateOption, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateValuesAdHocCall(List<PWAStreamValues> values, String bufferOption, String updateOption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'values' is set
		if (values == null)
			throw new ApiException("Missing required parameter 'values'");
		String localVarPath = "/streamsets/recorded";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPostBody =  values;
		if (bufferOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bufferOption", bufferOption));
		if (updateOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "updateOption", updateOption));
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Returns recorded values based on the passed time and retrieval mode. 
	 *
	 */
	public PWAItemsStreamValue getRecordedAtTimeAdHoc(String time, List<String> webId, String retrievalMode, String selectedFields, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValue> resp = getRecordedAtTimeAdHocWithHttpInfo(time, webId, retrievalMode, selectedFields, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns recorded values based on the passed time and retrieval mode. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValue> getRecordedAtTimeAdHocWithHttpInfo(String time, List<String> webId, String retrievalMode, String selectedFields, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getRecordedAtTimeAdHocCall(time, webId, retrievalMode, selectedFields, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values based on the passed time and retrieval mode. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAtTimeAdHocAsync(String time, List<String> webId, String retrievalMode, String selectedFields, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAtTimeAdHocCall(time, webId, retrievalMode, selectedFields, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAtTimeAdHocCall(String time, List<String> webId, String retrievalMode, String selectedFields, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/recordedattime";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (retrievalMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "retrievalMode", retrievalMode));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns recorded values of the specified streams at the specified times. 
	 *
	 */
	public PWAItemsStreamValues getRecordedAtTimesAdHoc(List<String> time, List<String> webId, String retrievalMode, String selectedFields, String sortOrder, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getRecordedAtTimesAdHocWithHttpInfo(time, webId, retrievalMode, selectedFields, sortOrder, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns recorded values of the specified streams at the specified times. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getRecordedAtTimesAdHocWithHttpInfo(List<String> time, List<String> webId, String retrievalMode, String selectedFields, String sortOrder, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getRecordedAtTimesAdHocCall(time, webId, retrievalMode, selectedFields, sortOrder, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values of the specified streams at the specified times. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAtTimesAdHocAsync(List<String> time, List<String> webId, String retrievalMode, String selectedFields, String sortOrder, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAtTimesAdHocCall(time, webId, retrievalMode, selectedFields, sortOrder, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAtTimesAdHocCall(List<String> time, List<String> webId, String retrievalMode, String selectedFields, String sortOrder, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/recordedattimes";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (retrievalMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "retrievalMode", retrievalMode));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns summary values of the specified streams. 
	 *
	 */
	public PWAItemsStreamSummaries getSummariesAdHoc(List<String> webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamSummaries> resp = getSummariesAdHocWithHttpInfo(webId, calculationBasis, endTime, filterExpression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns summary values of the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamSummaries> getSummariesAdHocWithHttpInfo(List<String> webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getSummariesAdHocCall(webId, calculationBasis, endTime, filterExpression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamSummaries>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns summary values of the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call getSummariesAdHocAsync(List<String> webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamSummaries> callback) throws ApiException {
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
		okhttp3.Call call = getSummariesAdHocCall(webId, calculationBasis, endTime, filterExpression, sampleInterval, sampleType, selectedFields, startTime, summaryDuration, summaryType, timeType, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSummariesAdHocCall(List<String> webId, String calculationBasis, String endTime, String filterExpression, String sampleInterval, String sampleType, String selectedFields, String startTime, String summaryDuration, List<String> summaryType, String timeType, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/summary";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (calculationBasis != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "calculationBasis", calculationBasis));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
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
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Receive stream updates 
	 *
	 */
	public PWAItemsStreamUpdatesRetrieve retrieveStreamSetUpdates(List<String> marker, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamUpdatesRetrieve> resp = retrieveStreamSetUpdatesWithHttpInfo(marker, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Receive stream updates (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamUpdatesRetrieve> retrieveStreamSetUpdatesWithHttpInfo(List<String> marker, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = retrieveStreamSetUpdatesCall(marker, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamUpdatesRetrieve>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Receive stream updates (asynchronously)
	 *
	 */
	public okhttp3.Call retrieveStreamSetUpdatesAsync(List<String> marker, String selectedFields, String webIdType, final ApiCallback<PWAItemsStreamUpdatesRetrieve> callback) throws ApiException {
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
		okhttp3.Call call = retrieveStreamSetUpdatesCall(marker, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call retrieveStreamSetUpdatesCall(List<String> marker, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'marker' is set
		if (marker == null)
			throw new ApiException("Missing required parameter 'marker'");
		String localVarPath = "/streamsets/updates";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (marker != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "marker", marker));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Register for stream updates 
	 *
	 */
	public PWAItemsStreamUpdatesRegister registerStreamSetUpdates(List<String> webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamUpdatesRegister> resp = registerStreamSetUpdatesWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Register for stream updates (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamUpdatesRegister> registerStreamSetUpdatesWithHttpInfo(List<String> webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = registerStreamSetUpdatesCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamUpdatesRegister>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Register for stream updates (asynchronously)
	 *
	 */
	public okhttp3.Call registerStreamSetUpdatesAsync(List<String> webId, String selectedFields, String webIdType, final ApiCallback<PWAItemsStreamUpdatesRegister> callback) throws ApiException {
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
		okhttp3.Call call = registerStreamSetUpdatesCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call registerStreamSetUpdatesCall(List<String> webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/updates";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Returns values of the specified streams. 
	 *
	 */
	public PWAItemsStreamValue getValuesAdHoc(List<String> webId, String selectedFields, String sortField, String sortOrder, String time, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValue> resp = getValuesAdHocWithHttpInfo(webId, selectedFields, sortField, sortOrder, time, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns values of the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValue> getValuesAdHocWithHttpInfo(List<String> webId, String selectedFields, String sortField, String sortOrder, String time, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getValuesAdHocCall(webId, selectedFields, sortField, sortOrder, time, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns values of the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call getValuesAdHocAsync(List<String> webId, String selectedFields, String sortField, String sortOrder, String time, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getValuesAdHocCall(webId, selectedFields, sortField, sortOrder, time, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getValuesAdHocCall(List<String> webId, String selectedFields, String sortField, String sortOrder, String time, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/value";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (webId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webId", webId));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Updates a single value for the specified streams. 
	 *
	 */
	public PWAItemsSubstatus updateValueAdHoc(List<PWAStreamValue> values, String bufferOption, String updateOption) throws ApiException {
		ApiResponse<PWAItemsSubstatus> resp = updateValueAdHocWithHttpInfo(values, bufferOption, updateOption);
		return resp.getData();
	}

	/**
	 * Updates a single value for the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsSubstatus> updateValueAdHocWithHttpInfo(List<PWAStreamValue> values, String bufferOption, String updateOption) throws ApiException {
		okhttp3.Call call = updateValueAdHocCall(values, bufferOption, updateOption,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsSubstatus>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Updates a single value for the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call updateValueAdHocAsync(List<PWAStreamValue> values, String bufferOption, String updateOption, final ApiCallback<PWAItemsSubstatus> callback) throws ApiException {
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
		okhttp3.Call call = updateValueAdHocCall(values, bufferOption, updateOption, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateValueAdHocCall(List<PWAStreamValue> values, String bufferOption, String updateOption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'values' is set
		if (values == null)
			throw new ApiException("Missing required parameter 'values'");
		String localVarPath = "/streamsets/value";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPostBody =  values;
		if (bufferOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bufferOption", bufferOption));
		if (updateOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "updateOption", updateOption));
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Opens a channel that will send messages about any value changes for the attributes of an Element, Event Frame, or Attribute. 
	 *
	 */
	public PWAItemsStreamValue getChannel(String webId, String categoryName, Integer heartbeatRate, Boolean includeInitialValues, String nameFilter, Boolean searchFullHierarchy, Boolean showExcluded, Boolean showHidden, String templateName, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValue> resp = getChannelWithHttpInfo(webId, categoryName, heartbeatRate, includeInitialValues, nameFilter, searchFullHierarchy, showExcluded, showHidden, templateName, webIdType);
		return resp.getData();
	}

	/**
	 * Opens a channel that will send messages about any value changes for the attributes of an Element, Event Frame, or Attribute. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValue> getChannelWithHttpInfo(String webId, String categoryName, Integer heartbeatRate, Boolean includeInitialValues, String nameFilter, Boolean searchFullHierarchy, Boolean showExcluded, Boolean showHidden, String templateName, String webIdType) throws ApiException {
		okhttp3.Call call = getChannelCall(webId, categoryName, heartbeatRate, includeInitialValues, nameFilter, searchFullHierarchy, showExcluded, showHidden, templateName, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Opens a channel that will send messages about any value changes for the attributes of an Element, Event Frame, or Attribute. (asynchronously)
	 *
	 */
	public okhttp3.Call getChannelAsync(String webId, String categoryName, Integer heartbeatRate, Boolean includeInitialValues, String nameFilter, Boolean searchFullHierarchy, Boolean showExcluded, Boolean showHidden, String templateName, String webIdType, final ApiCallback<PWAItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getChannelCall(webId, categoryName, heartbeatRate, includeInitialValues, nameFilter, searchFullHierarchy, showExcluded, showHidden, templateName, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getChannelCall(String webId, String categoryName, Integer heartbeatRate, Boolean includeInitialValues, String nameFilter, Boolean searchFullHierarchy, Boolean showExcluded, Boolean showHidden, String templateName, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/channel";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (heartbeatRate != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "heartbeatRate", heartbeatRate));
		if (includeInitialValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeInitialValues", includeInitialValues));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns End of stream values of the attributes for an Element, Event Frame or Attribute 
	 *
	 */
	public PWAItemsStreamValue getEnd(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String templateName, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValue> resp = getEndWithHttpInfo(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, templateName, webIdType);
		return resp.getData();
	}

	/**
	 * Returns End of stream values of the attributes for an Element, Event Frame or Attribute (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValue> getEndWithHttpInfo(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String templateName, String webIdType) throws ApiException {
		okhttp3.Call call = getEndCall(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, templateName, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns End of stream values of the attributes for an Element, Event Frame or Attribute (asynchronously)
	 *
	 */
	public okhttp3.Call getEndAsync(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String templateName, String webIdType, final ApiCallback<PWAItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getEndCall(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, templateName, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getEndCall(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String templateName, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/end";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns interpolated values of attributes for an element, event frame or attribute over the specified time range at the specified sampling interval. 
	 *
	 */
	public PWAItemsStreamValues getInterpolated(String webId, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String syncTime, String syncTimeBoundaryType, String templateName, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getInterpolatedWithHttpInfo(webId, categoryName, endTime, filterExpression, includeFilteredValues, interval, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, startTime, syncTime, syncTimeBoundaryType, templateName, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns interpolated values of attributes for an element, event frame or attribute over the specified time range at the specified sampling interval. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getInterpolatedWithHttpInfo(String webId, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String syncTime, String syncTimeBoundaryType, String templateName, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getInterpolatedCall(webId, categoryName, endTime, filterExpression, includeFilteredValues, interval, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, startTime, syncTime, syncTimeBoundaryType, templateName, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns interpolated values of attributes for an element, event frame or attribute over the specified time range at the specified sampling interval. (asynchronously)
	 *
	 */
	public okhttp3.Call getInterpolatedAsync(String webId, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String syncTime, String syncTimeBoundaryType, String templateName, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getInterpolatedCall(webId, categoryName, endTime, filterExpression, includeFilteredValues, interval, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, startTime, syncTime, syncTimeBoundaryType, templateName, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getInterpolatedCall(String webId, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, String interval, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String syncTime, String syncTimeBoundaryType, String templateName, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/interpolated";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (interval != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "interval", interval));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (syncTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "syncTime", syncTime));
		if (syncTimeBoundaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "syncTimeBoundaryType", syncTimeBoundaryType));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns interpolated values of attributes for an element, event frame or attribute at the specified times. 
	 *
	 */
	public PWAItemsStreamValues getInterpolatedAtTimes(String webId, List<String> time, String categoryName, String filterExpression, Boolean includeFilteredValues, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getInterpolatedAtTimesWithHttpInfo(webId, time, categoryName, filterExpression, includeFilteredValues, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns interpolated values of attributes for an element, event frame or attribute at the specified times. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getInterpolatedAtTimesWithHttpInfo(String webId, List<String> time, String categoryName, String filterExpression, Boolean includeFilteredValues, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getInterpolatedAtTimesCall(webId, time, categoryName, filterExpression, includeFilteredValues, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns interpolated values of attributes for an element, event frame or attribute at the specified times. (asynchronously)
	 *
	 */
	public okhttp3.Call getInterpolatedAtTimesAsync(String webId, List<String> time, String categoryName, String filterExpression, Boolean includeFilteredValues, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getInterpolatedAtTimesCall(webId, time, categoryName, filterExpression, includeFilteredValues, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getInterpolatedAtTimesCall(String webId, List<String> time, String categoryName, String filterExpression, Boolean includeFilteredValues, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		String localVarPath = "/streamsets/{webId}/interpolatedattimes";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns values of attributes for an element, event frame or attribute over the specified time range suitable for plotting over the number of intervals (typically represents pixels). 
	 *
	 */
	public PWAItemsStreamValues getPlot(String webId, String categoryName, String endTime, Integer intervals, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String templateName, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getPlotWithHttpInfo(webId, categoryName, endTime, intervals, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, startTime, templateName, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns values of attributes for an element, event frame or attribute over the specified time range suitable for plotting over the number of intervals (typically represents pixels). (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getPlotWithHttpInfo(String webId, String categoryName, String endTime, Integer intervals, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String templateName, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getPlotCall(webId, categoryName, endTime, intervals, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, startTime, templateName, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns values of attributes for an element, event frame or attribute over the specified time range suitable for plotting over the number of intervals (typically represents pixels). (asynchronously)
	 *
	 */
	public okhttp3.Call getPlotAsync(String webId, String categoryName, String endTime, Integer intervals, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String templateName, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getPlotCall(webId, categoryName, endTime, intervals, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, startTime, templateName, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getPlotCall(String webId, String categoryName, String endTime, Integer intervals, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String templateName, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/plot";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (intervals != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "intervals", intervals));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns recorded values of the attributes for an element, event frame, or attribute. 
	 *
	 */
	public PWAItemsStreamValues getRecorded(String webId, String boundaryType, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String templateName, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getRecordedWithHttpInfo(webId, boundaryType, categoryName, endTime, filterExpression, includeFilteredValues, maxCount, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, startTime, templateName, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns recorded values of the attributes for an element, event frame, or attribute. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getRecordedWithHttpInfo(String webId, String boundaryType, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String templateName, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getRecordedCall(webId, boundaryType, categoryName, endTime, filterExpression, includeFilteredValues, maxCount, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, startTime, templateName, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values of the attributes for an element, event frame, or attribute. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAsync(String webId, String boundaryType, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String templateName, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedCall(webId, boundaryType, categoryName, endTime, filterExpression, includeFilteredValues, maxCount, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, startTime, templateName, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedCall(String webId, String boundaryType, String categoryName, String endTime, String filterExpression, Boolean includeFilteredValues, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String startTime, String templateName, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/recorded";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (boundaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "boundaryType", boundaryType));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (includeFilteredValues != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeFilteredValues", includeFilteredValues));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Updates multiple values for the specified streams. 
	 *
	 */
	public PWAItemsItemsSubstatus updateValues(String webId, List<PWAStreamValues> values, String bufferOption, String updateOption) throws ApiException {
		ApiResponse<PWAItemsItemsSubstatus> resp = updateValuesWithHttpInfo(webId, values, bufferOption, updateOption);
		return resp.getData();
	}

	/**
	 * Updates multiple values for the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsItemsSubstatus> updateValuesWithHttpInfo(String webId, List<PWAStreamValues> values, String bufferOption, String updateOption) throws ApiException {
		okhttp3.Call call = updateValuesCall(webId, values, bufferOption, updateOption,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsItemsSubstatus>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Updates multiple values for the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call updateValuesAsync(String webId, List<PWAStreamValues> values, String bufferOption, String updateOption, final ApiCallback<PWAItemsItemsSubstatus> callback) throws ApiException {
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
		okhttp3.Call call = updateValuesCall(webId, values, bufferOption, updateOption, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateValuesCall(String webId, List<PWAStreamValues> values, String bufferOption, String updateOption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'values' is set
		if (values == null)
			throw new ApiException("Missing required parameter 'values'");
		String localVarPath = "/streamsets/{webId}/recorded";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		localVarPostBody =  values;
		if (bufferOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bufferOption", bufferOption));
		if (updateOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "updateOption", updateOption));
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Returns recorded values of the attributes for an element, event frame, or attribute. 
	 *
	 */
	public PWAItemsStreamValue getRecordedAtTime(String webId, String time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValue> resp = getRecordedAtTimeWithHttpInfo(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns recorded values of the attributes for an element, event frame, or attribute. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValue> getRecordedAtTimeWithHttpInfo(String webId, String time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getRecordedAtTimeCall(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values of the attributes for an element, event frame, or attribute. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAtTimeAsync(String webId, String time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAtTimeCall(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, templateName, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAtTimeCall(String webId, String time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String templateName, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		String localVarPath = "/streamsets/{webId}/recordedattime";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (retrievalMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "retrievalMode", retrievalMode));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns recorded values of attributes for an element, event frame or attribute at the specified times. 
	 *
	 */
	public PWAItemsStreamValues getRecordedAtTimes(String webId, List<String> time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValues> resp = getRecordedAtTimesWithHttpInfo(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns recorded values of attributes for an element, event frame or attribute at the specified times. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValues> getRecordedAtTimesWithHttpInfo(String webId, List<String> time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getRecordedAtTimesCall(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValues>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns recorded values of attributes for an element, event frame or attribute at the specified times. (asynchronously)
	 *
	 */
	public okhttp3.Call getRecordedAtTimesAsync(String webId, List<String> time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValues> callback) throws ApiException {
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
		okhttp3.Call call = getRecordedAtTimesCall(webId, time, categoryName, nameFilter, retrievalMode, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortOrder, templateName, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getRecordedAtTimesCall(String webId, List<String> time, String categoryName, String nameFilter, String retrievalMode, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortOrder, String templateName, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'time' is set
		if (time == null)
			throw new ApiException("Missing required parameter 'time'");
		String localVarPath = "/streamsets/{webId}/recordedattimes";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (retrievalMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "retrievalMode", retrievalMode));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns summary values of the attributes for an element, event frame or attribute. 
	 *
	 */
	public PWAItemsStreamSummaries getSummaries(String webId, String calculationBasis, String categoryName, String endTime, String filterExpression, String nameFilter, String sampleInterval, String sampleType, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String summaryDuration, List<String> summaryType, String templateName, String timeType, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamSummaries> resp = getSummariesWithHttpInfo(webId, calculationBasis, categoryName, endTime, filterExpression, nameFilter, sampleInterval, sampleType, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, summaryDuration, summaryType, templateName, timeType, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns summary values of the attributes for an element, event frame or attribute. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamSummaries> getSummariesWithHttpInfo(String webId, String calculationBasis, String categoryName, String endTime, String filterExpression, String nameFilter, String sampleInterval, String sampleType, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String summaryDuration, List<String> summaryType, String templateName, String timeType, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getSummariesCall(webId, calculationBasis, categoryName, endTime, filterExpression, nameFilter, sampleInterval, sampleType, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, summaryDuration, summaryType, templateName, timeType, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamSummaries>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns summary values of the attributes for an element, event frame or attribute. (asynchronously)
	 *
	 */
	public okhttp3.Call getSummariesAsync(String webId, String calculationBasis, String categoryName, String endTime, String filterExpression, String nameFilter, String sampleInterval, String sampleType, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String summaryDuration, List<String> summaryType, String templateName, String timeType, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamSummaries> callback) throws ApiException {
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
		okhttp3.Call call = getSummariesCall(webId, calculationBasis, categoryName, endTime, filterExpression, nameFilter, sampleInterval, sampleType, searchFullHierarchy, selectedFields, showExcluded, showHidden, startTime, summaryDuration, summaryType, templateName, timeType, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSummariesCall(String webId, String calculationBasis, String categoryName, String endTime, String filterExpression, String nameFilter, String sampleInterval, String sampleType, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String startTime, String summaryDuration, List<String> summaryType, String templateName, String timeType, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/summary";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (calculationBasis != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "calculationBasis", calculationBasis));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (filterExpression != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterExpression", filterExpression));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (sampleInterval != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sampleInterval", sampleInterval));
		if (sampleType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sampleType", sampleType));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
		if (summaryDuration != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "summaryDuration", summaryDuration));
		if (summaryType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "summaryType", summaryType));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (timeType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeType", timeType));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Returns values of the attributes for an Element, Event Frame or Attribute at the specified time. 
	 *
	 */
	public PWAItemsStreamValue getValues(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String templateName, String time, String timeZone, String webIdType) throws ApiException {
		ApiResponse<PWAItemsStreamValue> resp = getValuesWithHttpInfo(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, templateName, time, timeZone, webIdType);
		return resp.getData();
	}

	/**
	 * Returns values of the attributes for an Element, Event Frame or Attribute at the specified time. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsStreamValue> getValuesWithHttpInfo(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String templateName, String time, String timeZone, String webIdType) throws ApiException {
		okhttp3.Call call = getValuesCall(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, templateName, time, timeZone, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsStreamValue>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Returns values of the attributes for an Element, Event Frame or Attribute at the specified time. (asynchronously)
	 *
	 */
	public okhttp3.Call getValuesAsync(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String templateName, String time, String timeZone, String webIdType, final ApiCallback<PWAItemsStreamValue> callback) throws ApiException {
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
		okhttp3.Call call = getValuesCall(webId, categoryName, nameFilter, searchFullHierarchy, selectedFields, showExcluded, showHidden, sortField, sortOrder, templateName, time, timeZone, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getValuesCall(String webId, String categoryName, String nameFilter, Boolean searchFullHierarchy, String selectedFields, Boolean showExcluded, Boolean showHidden, String sortField, String sortOrder, String templateName, String time, String timeZone, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/streamsets/{webId}/value";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (showExcluded != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showExcluded", showExcluded));
		if (showHidden != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "showHidden", showHidden));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (templateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "templateName", templateName));
		if (time != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time", time));
		if (timeZone != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "timeZone", timeZone));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
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
	 * Updates a single value for the specified streams. 
	 *
	 */
	public PWAItemsSubstatus updateValue(String webId, List<PWAStreamValue> values, String bufferOption, String updateOption) throws ApiException {
		ApiResponse<PWAItemsSubstatus> resp = updateValueWithHttpInfo(webId, values, bufferOption, updateOption);
		return resp.getData();
	}

	/**
	 * Updates a single value for the specified streams. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsSubstatus> updateValueWithHttpInfo(String webId, List<PWAStreamValue> values, String bufferOption, String updateOption) throws ApiException {
		okhttp3.Call call = updateValueCall(webId, values, bufferOption, updateOption,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsSubstatus>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Updates a single value for the specified streams. (asynchronously)
	 *
	 */
	public okhttp3.Call updateValueAsync(String webId, List<PWAStreamValue> values, String bufferOption, String updateOption, final ApiCallback<PWAItemsSubstatus> callback) throws ApiException {
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
		okhttp3.Call call = updateValueCall(webId, values, bufferOption, updateOption, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateValueCall(String webId, List<PWAStreamValue> values, String bufferOption, String updateOption, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'values' is set
		if (values == null)
			throw new ApiException("Missing required parameter 'values'");
		String localVarPath = "/streamsets/{webId}/value";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		localVarPostBody =  values;
		if (bufferOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bufferOption", bufferOption));
		if (updateOption != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "updateOption", updateOption));
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

}
