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

public class AssetDatabaseControllerClient {
	private ApiClient apiClient;
	public AssetDatabaseControllerClient(ApiClient apiClient){
		this.apiClient = apiClient;
	}
	public ApiClient getApiClient() {
		return apiClient;
	}
	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}
	/**
	 * Retrieve an Asset Database by path. 
	 *
	 */
	public PWAAssetDatabase getByPath(String path, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAAssetDatabase> resp = getByPathWithHttpInfo(path, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve an Asset Database by path. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAAssetDatabase> getByPathWithHttpInfo(String path, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getByPathCall(path, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAAssetDatabase>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve an Asset Database by path. (asynchronously)
	 *
	 */
	public okhttp3.Call getByPathAsync(String path, String selectedFields, String webIdType, final ApiCallback<PWAAssetDatabase> callback) throws ApiException {
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
		okhttp3.Call call = getByPathCall(path, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getByPathCall(String path, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'path' is set
		if (path == null)
			throw new ApiException("Missing required parameter 'path'");
		String localVarPath = "/assetdatabases";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (path != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "path", path));
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
	 * Delete an asset database. 
	 *
	 */
	public void delete(String webId) throws ApiException {
		deleteWithHttpInfo(webId);
	}

	/**
	 * Delete an asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> deleteWithHttpInfo(String webId) throws ApiException {
		okhttp3.Call call = deleteCall(webId,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Delete an asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call deleteAsync(String webId, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = deleteCall(webId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call deleteCall(String webId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}";
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
		return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve an Asset Database. 
	 *
	 */
	public PWAAssetDatabase get(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAAssetDatabase> resp = getWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve an Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAAssetDatabase> getWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAAssetDatabase>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve an Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PWAAssetDatabase> callback) throws ApiException {
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
		okhttp3.Call call = getCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}";
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
	 * Update an asset database by replacing items in its definition. 
	 *
	 */
	public void update(String webId, PWAAssetDatabase database) throws ApiException {
		updateWithHttpInfo(webId, database);
	}

	/**
	 * Update an asset database by replacing items in its definition. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> updateWithHttpInfo(String webId, PWAAssetDatabase database) throws ApiException {
		okhttp3.Call call = updateCall(webId, database,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Update an asset database by replacing items in its definition. (asynchronously)
	 *
	 */
	public okhttp3.Call updateAsync(String webId, PWAAssetDatabase database, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = updateCall(webId, database, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateCall(String webId, PWAAssetDatabase database, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'database' is set
		if (database == null)
			throw new ApiException("Missing required parameter 'database'");
		String localVarPath = "/assetdatabases/{webId}";
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
		localVarPostBody =  database;
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
		return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve analyses based on the specified conditions. 
	 *
	 */
	public PWAItemsAnalysis findAnalyses(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, Integer startIndex, String webIdType) throws ApiException {
		ApiResponse<PWAItemsAnalysis> resp = findAnalysesWithHttpInfo(webId, field, maxCount, query, selectedFields, sortField, sortOrder, startIndex, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve analyses based on the specified conditions. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsAnalysis> findAnalysesWithHttpInfo(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, Integer startIndex, String webIdType) throws ApiException {
		okhttp3.Call call = findAnalysesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder, startIndex, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsAnalysis>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve analyses based on the specified conditions. (asynchronously)
	 *
	 */
	public okhttp3.Call findAnalysesAsync(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, Integer startIndex, String webIdType, final ApiCallback<PWAItemsAnalysis> callback) throws ApiException {
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
		okhttp3.Call call = findAnalysesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder, startIndex, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call findAnalysesCall(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, Integer startIndex, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'field' is set
		if (field == null)
			throw new ApiException("Missing required parameter 'field'");
		String localVarPath = "/assetdatabases/{webId}/analyses";
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
		if (field != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "field", field));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (query != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "query", query));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
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
	 * Retrieve analysis categories for a given Asset Database. 
	 *
	 */
	public PWAItemsAnalysisCategory getAnalysisCategories(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAItemsAnalysisCategory> resp = getAnalysisCategoriesWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve analysis categories for a given Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsAnalysisCategory> getAnalysisCategoriesWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getAnalysisCategoriesCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsAnalysisCategory>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve analysis categories for a given Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getAnalysisCategoriesAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PWAItemsAnalysisCategory> callback) throws ApiException {
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
		okhttp3.Call call = getAnalysisCategoriesCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAnalysisCategoriesCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/analysiscategories";
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
	 * Create an analysis category at the Asset Database root. 
	 *
	 */
	public void createAnalysisCategory(String webId, PWAAnalysisCategory analysisCategory, String webIdType) throws ApiException {
		createAnalysisCategoryWithHttpInfo(webId, analysisCategory, webIdType);
	}

	/**
	 * Create an analysis category at the Asset Database root. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createAnalysisCategoryWithHttpInfo(String webId, PWAAnalysisCategory analysisCategory, String webIdType) throws ApiException {
		okhttp3.Call call = createAnalysisCategoryCall(webId, analysisCategory, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an analysis category at the Asset Database root. (asynchronously)
	 *
	 */
	public okhttp3.Call createAnalysisCategoryAsync(String webId, PWAAnalysisCategory analysisCategory, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createAnalysisCategoryCall(webId, analysisCategory, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createAnalysisCategoryCall(String webId, PWAAnalysisCategory analysisCategory, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'analysisCategory' is set
		if (analysisCategory == null)
			throw new ApiException("Missing required parameter 'analysisCategory'");
		String localVarPath = "/assetdatabases/{webId}/analysiscategories";
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
		localVarPostBody =  analysisCategory;
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
	 * Retrieve analysis templates based on the specified criteria. By default, all analysis templates in the specified Asset Database are returned. 
	 *
	 */
	public PWAItemsAnalysisTemplate getAnalysisTemplates(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, String webIdType) throws ApiException {
		ApiResponse<PWAItemsAnalysisTemplate> resp = getAnalysisTemplatesWithHttpInfo(webId, field, maxCount, query, selectedFields, sortField, sortOrder, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve analysis templates based on the specified criteria. By default, all analysis templates in the specified Asset Database are returned. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsAnalysisTemplate> getAnalysisTemplatesWithHttpInfo(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, String webIdType) throws ApiException {
		okhttp3.Call call = getAnalysisTemplatesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsAnalysisTemplate>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve analysis templates based on the specified criteria. By default, all analysis templates in the specified Asset Database are returned. (asynchronously)
	 *
	 */
	public okhttp3.Call getAnalysisTemplatesAsync(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, String webIdType, final ApiCallback<PWAItemsAnalysisTemplate> callback) throws ApiException {
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
		okhttp3.Call call = getAnalysisTemplatesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAnalysisTemplatesCall(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'field' is set
		if (field == null)
			throw new ApiException("Missing required parameter 'field'");
		String localVarPath = "/assetdatabases/{webId}/analysistemplates";
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
		if (field != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "field", field));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (query != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "query", query));
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
	 * Create an analysis template at the Asset Database root. 
	 *
	 */
	public void createAnalysisTemplate(String webId, PWAAnalysisTemplate template, String webIdType) throws ApiException {
		createAnalysisTemplateWithHttpInfo(webId, template, webIdType);
	}

	/**
	 * Create an analysis template at the Asset Database root. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createAnalysisTemplateWithHttpInfo(String webId, PWAAnalysisTemplate template, String webIdType) throws ApiException {
		okhttp3.Call call = createAnalysisTemplateCall(webId, template, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an analysis template at the Asset Database root. (asynchronously)
	 *
	 */
	public okhttp3.Call createAnalysisTemplateAsync(String webId, PWAAnalysisTemplate template, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createAnalysisTemplateCall(webId, template, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createAnalysisTemplateCall(String webId, PWAAnalysisTemplate template, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'template' is set
		if (template == null)
			throw new ApiException("Missing required parameter 'template'");
		String localVarPath = "/assetdatabases/{webId}/analysistemplates";
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
		localVarPostBody =  template;
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
	 * Retrieve attribute categories for a given Asset Database. 
	 *
	 */
	public PWAItemsAttributeCategory getAttributeCategories(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAItemsAttributeCategory> resp = getAttributeCategoriesWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve attribute categories for a given Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsAttributeCategory> getAttributeCategoriesWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getAttributeCategoriesCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsAttributeCategory>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve attribute categories for a given Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getAttributeCategoriesAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PWAItemsAttributeCategory> callback) throws ApiException {
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
		okhttp3.Call call = getAttributeCategoriesCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getAttributeCategoriesCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/attributecategories";
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
	 * Create an attribute category at the Asset Database root. 
	 *
	 */
	public void createAttributeCategory(String webId, PWAAttributeCategory attributeCategory, String webIdType) throws ApiException {
		createAttributeCategoryWithHttpInfo(webId, attributeCategory, webIdType);
	}

	/**
	 * Create an attribute category at the Asset Database root. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createAttributeCategoryWithHttpInfo(String webId, PWAAttributeCategory attributeCategory, String webIdType) throws ApiException {
		okhttp3.Call call = createAttributeCategoryCall(webId, attributeCategory, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an attribute category at the Asset Database root. (asynchronously)
	 *
	 */
	public okhttp3.Call createAttributeCategoryAsync(String webId, PWAAttributeCategory attributeCategory, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createAttributeCategoryCall(webId, attributeCategory, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createAttributeCategoryCall(String webId, PWAAttributeCategory attributeCategory, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'attributeCategory' is set
		if (attributeCategory == null)
			throw new ApiException("Missing required parameter 'attributeCategory'");
		String localVarPath = "/assetdatabases/{webId}/attributecategories";
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
		localVarPostBody =  attributeCategory;
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
	 * Retrieves a list of element attributes matching the specified filters from the specified asset database. 
	 *
	 */
	public PWAItemsAttribute findElementAttributes(String webId, String associations, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String elementCategory, String elementDescriptionFilter, String elementNameFilter, String elementTemplate, String elementType, Integer maxCount, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String webIdType) throws ApiException {
		ApiResponse<PWAItemsAttribute> resp = findElementAttributesWithHttpInfo(webId, associations, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, elementCategory, elementDescriptionFilter, elementNameFilter, elementTemplate, elementType, maxCount, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieves a list of element attributes matching the specified filters from the specified asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsAttribute> findElementAttributesWithHttpInfo(String webId, String associations, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String elementCategory, String elementDescriptionFilter, String elementNameFilter, String elementTemplate, String elementType, Integer maxCount, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String webIdType) throws ApiException {
		okhttp3.Call call = findElementAttributesCall(webId, associations, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, elementCategory, elementDescriptionFilter, elementNameFilter, elementTemplate, elementType, maxCount, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsAttribute>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieves a list of element attributes matching the specified filters from the specified asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call findElementAttributesAsync(String webId, String associations, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String elementCategory, String elementDescriptionFilter, String elementNameFilter, String elementTemplate, String elementType, Integer maxCount, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String webIdType, final ApiCallback<PWAItemsAttribute> callback) throws ApiException {
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
		okhttp3.Call call = findElementAttributesCall(webId, associations, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, elementCategory, elementDescriptionFilter, elementNameFilter, elementTemplate, elementType, maxCount, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call findElementAttributesCall(String webId, String associations, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String elementCategory, String elementDescriptionFilter, String elementNameFilter, String elementTemplate, String elementType, Integer maxCount, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/elementattributes";
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
		if (associations != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "associations", associations));
		if (attributeCategory != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeCategory", attributeCategory));
		if (attributeDescriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeDescriptionFilter", attributeDescriptionFilter));
		if (attributeNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeNameFilter", attributeNameFilter));
		if (attributeType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeType", attributeType));
		if (elementCategory != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementCategory", elementCategory));
		if (elementDescriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementDescriptionFilter", elementDescriptionFilter));
		if (elementNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementNameFilter", elementNameFilter));
		if (elementTemplate != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementTemplate", elementTemplate));
		if (elementType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementType", elementType));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
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
	 * Retrieve element categories for a given Asset Database. 
	 *
	 */
	public PWAItemsElementCategory getElementCategories(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAItemsElementCategory> resp = getElementCategoriesWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve element categories for a given Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsElementCategory> getElementCategoriesWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getElementCategoriesCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsElementCategory>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve element categories for a given Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getElementCategoriesAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PWAItemsElementCategory> callback) throws ApiException {
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
		okhttp3.Call call = getElementCategoriesCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getElementCategoriesCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/elementcategories";
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
	 * Create an element category at the Asset Database root. 
	 *
	 */
	public void createElementCategory(String webId, PWAElementCategory elementCategory, String webIdType) throws ApiException {
		createElementCategoryWithHttpInfo(webId, elementCategory, webIdType);
	}

	/**
	 * Create an element category at the Asset Database root. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createElementCategoryWithHttpInfo(String webId, PWAElementCategory elementCategory, String webIdType) throws ApiException {
		okhttp3.Call call = createElementCategoryCall(webId, elementCategory, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an element category at the Asset Database root. (asynchronously)
	 *
	 */
	public okhttp3.Call createElementCategoryAsync(String webId, PWAElementCategory elementCategory, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createElementCategoryCall(webId, elementCategory, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createElementCategoryCall(String webId, PWAElementCategory elementCategory, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'elementCategory' is set
		if (elementCategory == null)
			throw new ApiException("Missing required parameter 'elementCategory'");
		String localVarPath = "/assetdatabases/{webId}/elementcategories";
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
		localVarPostBody =  elementCategory;
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
	 * Retrieve elements based on the specified conditions. By default, this method selects immediate children of the specified asset database. 
	 *
	 */
	public PWAItemsElement getElements(String webId, String associations, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, String webIdType) throws ApiException {
		ApiResponse<PWAItemsElement> resp = getElementsWithHttpInfo(webId, associations, categoryName, descriptionFilter, elementType, maxCount, nameFilter, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex, templateName, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve elements based on the specified conditions. By default, this method selects immediate children of the specified asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsElement> getElementsWithHttpInfo(String webId, String associations, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, String webIdType) throws ApiException {
		okhttp3.Call call = getElementsCall(webId, associations, categoryName, descriptionFilter, elementType, maxCount, nameFilter, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex, templateName, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsElement>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve elements based on the specified conditions. By default, this method selects immediate children of the specified asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call getElementsAsync(String webId, String associations, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, String webIdType, final ApiCallback<PWAItemsElement> callback) throws ApiException {
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
		okhttp3.Call call = getElementsCall(webId, associations, categoryName, descriptionFilter, elementType, maxCount, nameFilter, searchFullHierarchy, selectedFields, sortField, sortOrder, startIndex, templateName, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getElementsCall(String webId, String associations, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, Boolean searchFullHierarchy, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/elements";
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
		if (associations != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "associations", associations));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (descriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "descriptionFilter", descriptionFilter));
		if (elementType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementType", elementType));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
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
	 * Create a child element. 
	 *
	 */
	public void createElement(String webId, PWAElement element, String webIdType) throws ApiException {
		createElementWithHttpInfo(webId, element, webIdType);
	}

	/**
	 * Create a child element. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createElementWithHttpInfo(String webId, PWAElement element, String webIdType) throws ApiException {
		okhttp3.Call call = createElementCall(webId, element, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a child element. (asynchronously)
	 *
	 */
	public okhttp3.Call createElementAsync(String webId, PWAElement element, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createElementCall(webId, element, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createElementCall(String webId, PWAElement element, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'element' is set
		if (element == null)
			throw new ApiException("Missing required parameter 'element'");
		String localVarPath = "/assetdatabases/{webId}/elements";
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
		localVarPostBody =  element;
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
	 * Retrieve element templates based on the specified criteria. Only templates of instance type "Element" and "EventFrame" are returned. By default, all element and event frame templates in the specified Asset Database are returned. 
	 *
	 */
	public PWAItemsElementTemplate getElementTemplates(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, String webIdType) throws ApiException {
		ApiResponse<PWAItemsElementTemplate> resp = getElementTemplatesWithHttpInfo(webId, field, maxCount, query, selectedFields, sortField, sortOrder, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve element templates based on the specified criteria. Only templates of instance type "Element" and "EventFrame" are returned. By default, all element and event frame templates in the specified Asset Database are returned. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsElementTemplate> getElementTemplatesWithHttpInfo(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, String webIdType) throws ApiException {
		okhttp3.Call call = getElementTemplatesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsElementTemplate>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve element templates based on the specified criteria. Only templates of instance type "Element" and "EventFrame" are returned. By default, all element and event frame templates in the specified Asset Database are returned. (asynchronously)
	 *
	 */
	public okhttp3.Call getElementTemplatesAsync(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, String webIdType, final ApiCallback<PWAItemsElementTemplate> callback) throws ApiException {
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
		okhttp3.Call call = getElementTemplatesCall(webId, field, maxCount, query, selectedFields, sortField, sortOrder, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getElementTemplatesCall(String webId, List<String> field, Integer maxCount, String query, String selectedFields, String sortField, String sortOrder, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'field' is set
		if (field == null)
			throw new ApiException("Missing required parameter 'field'");
		String localVarPath = "/assetdatabases/{webId}/elementtemplates";
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
		if (field != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "field", field));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (query != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "query", query));
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
	 * Create a template at the Asset Database root. Specify InstanceType of "Element" or "EventFrame" to create element or event frame template respectively. Only these two types of templates can be created. 
	 *
	 */
	public void createElementTemplate(String webId, PWAElementTemplate template, String webIdType) throws ApiException {
		createElementTemplateWithHttpInfo(webId, template, webIdType);
	}

	/**
	 * Create a template at the Asset Database root. Specify InstanceType of "Element" or "EventFrame" to create element or event frame template respectively. Only these two types of templates can be created. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createElementTemplateWithHttpInfo(String webId, PWAElementTemplate template, String webIdType) throws ApiException {
		okhttp3.Call call = createElementTemplateCall(webId, template, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a template at the Asset Database root. Specify InstanceType of "Element" or "EventFrame" to create element or event frame template respectively. Only these two types of templates can be created. (asynchronously)
	 *
	 */
	public okhttp3.Call createElementTemplateAsync(String webId, PWAElementTemplate template, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createElementTemplateCall(webId, template, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createElementTemplateCall(String webId, PWAElementTemplate template, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'template' is set
		if (template == null)
			throw new ApiException("Missing required parameter 'template'");
		String localVarPath = "/assetdatabases/{webId}/elementtemplates";
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
		localVarPostBody =  template;
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
	 * Retrieve enumeration sets for given asset database. 
	 *
	 */
	public PWAItemsEnumerationSet getEnumerationSets(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAItemsEnumerationSet> resp = getEnumerationSetsWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve enumeration sets for given asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsEnumerationSet> getEnumerationSetsWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getEnumerationSetsCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsEnumerationSet>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve enumeration sets for given asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call getEnumerationSetsAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PWAItemsEnumerationSet> callback) throws ApiException {
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
		okhttp3.Call call = getEnumerationSetsCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getEnumerationSetsCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/enumerationsets";
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
	 * Create an enumeration set at the Asset Database. 
	 *
	 */
	public void createEnumerationSet(String webId, PWAEnumerationSet enumerationSet, String webIdType) throws ApiException {
		createEnumerationSetWithHttpInfo(webId, enumerationSet, webIdType);
	}

	/**
	 * Create an enumeration set at the Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createEnumerationSetWithHttpInfo(String webId, PWAEnumerationSet enumerationSet, String webIdType) throws ApiException {
		okhttp3.Call call = createEnumerationSetCall(webId, enumerationSet, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an enumeration set at the Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call createEnumerationSetAsync(String webId, PWAEnumerationSet enumerationSet, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createEnumerationSetCall(webId, enumerationSet, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createEnumerationSetCall(String webId, PWAEnumerationSet enumerationSet, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'enumerationSet' is set
		if (enumerationSet == null)
			throw new ApiException("Missing required parameter 'enumerationSet'");
		String localVarPath = "/assetdatabases/{webId}/enumerationsets";
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
		localVarPostBody =  enumerationSet;
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
	 * Retrieves a list of event frame attributes matching the specified filters from the specified asset database. 
	 *
	 */
	public PWAItemsAttribute findEventFrameAttributes(String webId, String associations, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String endTime, String eventFrameCategory, String eventFrameDescriptionFilter, String eventFrameNameFilter, String eventFrameTemplate, Integer maxCount, String referencedElementNameFilter, Boolean searchFullHierarchy, String searchMode, String selectedFields, String sortField, String sortOrder, Integer startIndex, String startTime, String webIdType) throws ApiException {
		ApiResponse<PWAItemsAttribute> resp = findEventFrameAttributesWithHttpInfo(webId, associations, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, endTime, eventFrameCategory, eventFrameDescriptionFilter, eventFrameNameFilter, eventFrameTemplate, maxCount, referencedElementNameFilter, searchFullHierarchy, searchMode, selectedFields, sortField, sortOrder, startIndex, startTime, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieves a list of event frame attributes matching the specified filters from the specified asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsAttribute> findEventFrameAttributesWithHttpInfo(String webId, String associations, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String endTime, String eventFrameCategory, String eventFrameDescriptionFilter, String eventFrameNameFilter, String eventFrameTemplate, Integer maxCount, String referencedElementNameFilter, Boolean searchFullHierarchy, String searchMode, String selectedFields, String sortField, String sortOrder, Integer startIndex, String startTime, String webIdType) throws ApiException {
		okhttp3.Call call = findEventFrameAttributesCall(webId, associations, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, endTime, eventFrameCategory, eventFrameDescriptionFilter, eventFrameNameFilter, eventFrameTemplate, maxCount, referencedElementNameFilter, searchFullHierarchy, searchMode, selectedFields, sortField, sortOrder, startIndex, startTime, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsAttribute>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieves a list of event frame attributes matching the specified filters from the specified asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call findEventFrameAttributesAsync(String webId, String associations, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String endTime, String eventFrameCategory, String eventFrameDescriptionFilter, String eventFrameNameFilter, String eventFrameTemplate, Integer maxCount, String referencedElementNameFilter, Boolean searchFullHierarchy, String searchMode, String selectedFields, String sortField, String sortOrder, Integer startIndex, String startTime, String webIdType, final ApiCallback<PWAItemsAttribute> callback) throws ApiException {
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
		okhttp3.Call call = findEventFrameAttributesCall(webId, associations, attributeCategory, attributeDescriptionFilter, attributeNameFilter, attributeType, endTime, eventFrameCategory, eventFrameDescriptionFilter, eventFrameNameFilter, eventFrameTemplate, maxCount, referencedElementNameFilter, searchFullHierarchy, searchMode, selectedFields, sortField, sortOrder, startIndex, startTime, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call findEventFrameAttributesCall(String webId, String associations, String attributeCategory, String attributeDescriptionFilter, String attributeNameFilter, String attributeType, String endTime, String eventFrameCategory, String eventFrameDescriptionFilter, String eventFrameNameFilter, String eventFrameTemplate, Integer maxCount, String referencedElementNameFilter, Boolean searchFullHierarchy, String searchMode, String selectedFields, String sortField, String sortOrder, Integer startIndex, String startTime, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/eventframeattributes";
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
		if (associations != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "associations", associations));
		if (attributeCategory != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeCategory", attributeCategory));
		if (attributeDescriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeDescriptionFilter", attributeDescriptionFilter));
		if (attributeNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeNameFilter", attributeNameFilter));
		if (attributeType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeType", attributeType));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (eventFrameCategory != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "eventFrameCategory", eventFrameCategory));
		if (eventFrameDescriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "eventFrameDescriptionFilter", eventFrameDescriptionFilter));
		if (eventFrameNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "eventFrameNameFilter", eventFrameNameFilter));
		if (eventFrameTemplate != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "eventFrameTemplate", eventFrameTemplate));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (referencedElementNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referencedElementNameFilter", referencedElementNameFilter));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (searchMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchMode", searchMode));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
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
	 * Retrieve event frames based on the specified conditions. By default, returns all children of the specified root resource that have been active in the past 8 hours. 
	 *
	 */
	public PWAItemsEventFrame getEventFrames(String webId, Boolean canBeAcknowledged, String categoryName, String endTime, Boolean isAcknowledged, Integer maxCount, String nameFilter, String referencedElementNameFilter, String referencedElementTemplateName, Boolean searchFullHierarchy, String searchMode, String selectedFields, List<String> severity, String sortField, String sortOrder, Integer startIndex, String startTime, String templateName, String webIdType) throws ApiException {
		ApiResponse<PWAItemsEventFrame> resp = getEventFramesWithHttpInfo(webId, canBeAcknowledged, categoryName, endTime, isAcknowledged, maxCount, nameFilter, referencedElementNameFilter, referencedElementTemplateName, searchFullHierarchy, searchMode, selectedFields, severity, sortField, sortOrder, startIndex, startTime, templateName, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve event frames based on the specified conditions. By default, returns all children of the specified root resource that have been active in the past 8 hours. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsEventFrame> getEventFramesWithHttpInfo(String webId, Boolean canBeAcknowledged, String categoryName, String endTime, Boolean isAcknowledged, Integer maxCount, String nameFilter, String referencedElementNameFilter, String referencedElementTemplateName, Boolean searchFullHierarchy, String searchMode, String selectedFields, List<String> severity, String sortField, String sortOrder, Integer startIndex, String startTime, String templateName, String webIdType) throws ApiException {
		okhttp3.Call call = getEventFramesCall(webId, canBeAcknowledged, categoryName, endTime, isAcknowledged, maxCount, nameFilter, referencedElementNameFilter, referencedElementTemplateName, searchFullHierarchy, searchMode, selectedFields, severity, sortField, sortOrder, startIndex, startTime, templateName, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsEventFrame>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve event frames based on the specified conditions. By default, returns all children of the specified root resource that have been active in the past 8 hours. (asynchronously)
	 *
	 */
	public okhttp3.Call getEventFramesAsync(String webId, Boolean canBeAcknowledged, String categoryName, String endTime, Boolean isAcknowledged, Integer maxCount, String nameFilter, String referencedElementNameFilter, String referencedElementTemplateName, Boolean searchFullHierarchy, String searchMode, String selectedFields, List<String> severity, String sortField, String sortOrder, Integer startIndex, String startTime, String templateName, String webIdType, final ApiCallback<PWAItemsEventFrame> callback) throws ApiException {
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
		okhttp3.Call call = getEventFramesCall(webId, canBeAcknowledged, categoryName, endTime, isAcknowledged, maxCount, nameFilter, referencedElementNameFilter, referencedElementTemplateName, searchFullHierarchy, searchMode, selectedFields, severity, sortField, sortOrder, startIndex, startTime, templateName, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getEventFramesCall(String webId, Boolean canBeAcknowledged, String categoryName, String endTime, Boolean isAcknowledged, Integer maxCount, String nameFilter, String referencedElementNameFilter, String referencedElementTemplateName, Boolean searchFullHierarchy, String searchMode, String selectedFields, List<String> severity, String sortField, String sortOrder, Integer startIndex, String startTime, String templateName, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/eventframes";
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
		if (canBeAcknowledged != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "canBeAcknowledged", canBeAcknowledged));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (isAcknowledged != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "isAcknowledged", isAcknowledged));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (referencedElementNameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referencedElementNameFilter", referencedElementNameFilter));
		if (referencedElementTemplateName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referencedElementTemplateName", referencedElementTemplateName));
		if (searchFullHierarchy != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchFullHierarchy", searchFullHierarchy));
		if (searchMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "searchMode", searchMode));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (severity != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "severity", severity));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
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
	 * Create an event frame. 
	 *
	 */
	public void createEventFrame(String webId, PWAEventFrame eventFrame, String webIdType) throws ApiException {
		createEventFrameWithHttpInfo(webId, eventFrame, webIdType);
	}

	/**
	 * Create an event frame. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createEventFrameWithHttpInfo(String webId, PWAEventFrame eventFrame, String webIdType) throws ApiException {
		okhttp3.Call call = createEventFrameCall(webId, eventFrame, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create an event frame. (asynchronously)
	 *
	 */
	public okhttp3.Call createEventFrameAsync(String webId, PWAEventFrame eventFrame, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createEventFrameCall(webId, eventFrame, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createEventFrameCall(String webId, PWAEventFrame eventFrame, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'eventFrame' is set
		if (eventFrame == null)
			throw new ApiException("Missing required parameter 'eventFrame'");
		String localVarPath = "/assetdatabases/{webId}/eventframes";
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
		localVarPostBody =  eventFrame;
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
	 * Export the asset database. 
	 *
	 */
	public void export(String webId, String endTime, List<String> exportMode, String startTime) throws ApiException {
		exportWithHttpInfo(webId, endTime, exportMode, startTime);
	}

	/**
	 * Export the asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> exportWithHttpInfo(String webId, String endTime, List<String> exportMode, String startTime) throws ApiException {
		okhttp3.Call call = exportCall(webId, endTime, exportMode, startTime,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Export the asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call exportAsync(String webId, String endTime, List<String> exportMode, String startTime, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = exportCall(webId, endTime, exportMode, startTime, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call exportCall(String webId, String endTime, List<String> exportMode, String startTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/export";
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
		if (endTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "endTime", endTime));
		if (exportMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "exportMode", exportMode));
		if (startTime != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startTime", startTime));
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
	 * Import an asset database. 
	 *
	 */
	public void importData(String webId, List<String> importMode) throws ApiException {
		importDataWithHttpInfo(webId, importMode);
	}

	/**
	 * Import an asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> importDataWithHttpInfo(String webId, List<String> importMode) throws ApiException {
		okhttp3.Call call = importDataCall(webId, importMode,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Import an asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call importDataAsync(String webId, List<String> importMode, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = importDataCall(webId, importMode, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call importDataCall(String webId, List<String> importMode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/import";
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
		if (importMode != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "importMode", importMode));
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
	 * Remove a reference to an existing element from the specified database. 
	 *
	 */
	public void removeReferencedElement(String webId, List<String> referencedElementWebId) throws ApiException {
		removeReferencedElementWithHttpInfo(webId, referencedElementWebId);
	}

	/**
	 * Remove a reference to an existing element from the specified database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> removeReferencedElementWithHttpInfo(String webId, List<String> referencedElementWebId) throws ApiException {
		okhttp3.Call call = removeReferencedElementCall(webId, referencedElementWebId,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Remove a reference to an existing element from the specified database. (asynchronously)
	 *
	 */
	public okhttp3.Call removeReferencedElementAsync(String webId, List<String> referencedElementWebId, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = removeReferencedElementCall(webId, referencedElementWebId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call removeReferencedElementCall(String webId, List<String> referencedElementWebId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'referencedElementWebId' is set
		if (referencedElementWebId == null)
			throw new ApiException("Missing required parameter 'referencedElementWebId'");
		String localVarPath = "/assetdatabases/{webId}/referencedelements";
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
		if (referencedElementWebId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referencedElementWebId", referencedElementWebId));
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
		return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve referenced elements based on the specified conditions. By default, this method selects all referenced elements at the root level of the asset database. 
	 *
	 */
	public PWAItemsElement getReferencedElements(String webId, String associations, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, String webIdType) throws ApiException {
		ApiResponse<PWAItemsElement> resp = getReferencedElementsWithHttpInfo(webId, associations, categoryName, descriptionFilter, elementType, maxCount, nameFilter, selectedFields, sortField, sortOrder, startIndex, templateName, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve referenced elements based on the specified conditions. By default, this method selects all referenced elements at the root level of the asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsElement> getReferencedElementsWithHttpInfo(String webId, String associations, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, String webIdType) throws ApiException {
		okhttp3.Call call = getReferencedElementsCall(webId, associations, categoryName, descriptionFilter, elementType, maxCount, nameFilter, selectedFields, sortField, sortOrder, startIndex, templateName, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsElement>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve referenced elements based on the specified conditions. By default, this method selects all referenced elements at the root level of the asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call getReferencedElementsAsync(String webId, String associations, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, String webIdType, final ApiCallback<PWAItemsElement> callback) throws ApiException {
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
		okhttp3.Call call = getReferencedElementsCall(webId, associations, categoryName, descriptionFilter, elementType, maxCount, nameFilter, selectedFields, sortField, sortOrder, startIndex, templateName, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getReferencedElementsCall(String webId, String associations, String categoryName, String descriptionFilter, String elementType, Integer maxCount, String nameFilter, String selectedFields, String sortField, String sortOrder, Integer startIndex, String templateName, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/referencedelements";
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
		if (associations != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "associations", associations));
		if (categoryName != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categoryName", categoryName));
		if (descriptionFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "descriptionFilter", descriptionFilter));
		if (elementType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "elementType", elementType));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (sortField != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortField", sortField));
		if (sortOrder != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sortOrder", sortOrder));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
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
	 * Add a reference to an existing element to the specified database. 
	 *
	 */
	public void addReferencedElement(String webId, List<String> referencedElementWebId, String referenceType) throws ApiException {
		addReferencedElementWithHttpInfo(webId, referencedElementWebId, referenceType);
	}

	/**
	 * Add a reference to an existing element to the specified database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> addReferencedElementWithHttpInfo(String webId, List<String> referencedElementWebId, String referenceType) throws ApiException {
		okhttp3.Call call = addReferencedElementCall(webId, referencedElementWebId, referenceType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Add a reference to an existing element to the specified database. (asynchronously)
	 *
	 */
	public okhttp3.Call addReferencedElementAsync(String webId, List<String> referencedElementWebId, String referenceType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = addReferencedElementCall(webId, referencedElementWebId, referenceType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call addReferencedElementCall(String webId, List<String> referencedElementWebId, String referenceType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'referencedElementWebId' is set
		if (referencedElementWebId == null)
			throw new ApiException("Missing required parameter 'referencedElementWebId'");
		String localVarPath = "/assetdatabases/{webId}/referencedelements";
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
		if (referencedElementWebId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referencedElementWebId", referencedElementWebId));
		if (referenceType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "referenceType", referenceType));
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
	 * Get the security information of the specified security item associated with the asset database for a specified user. 
	 *
	 */
	public PWAItemsSecurityRights getSecurity(String webId, List<String> securityItem, List<String> userIdentity, Boolean forceRefresh, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAItemsSecurityRights> resp = getSecurityWithHttpInfo(webId, securityItem, userIdentity, forceRefresh, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Get the security information of the specified security item associated with the asset database for a specified user. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsSecurityRights> getSecurityWithHttpInfo(String webId, List<String> securityItem, List<String> userIdentity, Boolean forceRefresh, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getSecurityCall(webId, securityItem, userIdentity, forceRefresh, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsSecurityRights>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Get the security information of the specified security item associated with the asset database for a specified user. (asynchronously)
	 *
	 */
	public okhttp3.Call getSecurityAsync(String webId, List<String> securityItem, List<String> userIdentity, Boolean forceRefresh, String selectedFields, String webIdType, final ApiCallback<PWAItemsSecurityRights> callback) throws ApiException {
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
		okhttp3.Call call = getSecurityCall(webId, securityItem, userIdentity, forceRefresh, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSecurityCall(String webId, List<String> securityItem, List<String> userIdentity, Boolean forceRefresh, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'securityItem' is set
		if (securityItem == null)
			throw new ApiException("Missing required parameter 'securityItem'");
		// verify the required parameter 'userIdentity' is set
		if (userIdentity == null)
			throw new ApiException("Missing required parameter 'userIdentity'");
		String localVarPath = "/assetdatabases/{webId}/security";
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
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
		if (userIdentity != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "userIdentity", userIdentity));
		if (forceRefresh != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "forceRefresh", forceRefresh));
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
	 * Retrieve the security entries of the specified security item associated with the asset database based on the specified criteria. By default, all security entries for this asset database are returned. 
	 *
	 */
	public PWAItemsSecurityEntry getSecurityEntries(String webId, String nameFilter, String securityItem, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAItemsSecurityEntry> resp = getSecurityEntriesWithHttpInfo(webId, nameFilter, securityItem, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve the security entries of the specified security item associated with the asset database based on the specified criteria. By default, all security entries for this asset database are returned. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsSecurityEntry> getSecurityEntriesWithHttpInfo(String webId, String nameFilter, String securityItem, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getSecurityEntriesCall(webId, nameFilter, securityItem, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsSecurityEntry>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve the security entries of the specified security item associated with the asset database based on the specified criteria. By default, all security entries for this asset database are returned. (asynchronously)
	 *
	 */
	public okhttp3.Call getSecurityEntriesAsync(String webId, String nameFilter, String securityItem, String selectedFields, String webIdType, final ApiCallback<PWAItemsSecurityEntry> callback) throws ApiException {
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
		okhttp3.Call call = getSecurityEntriesCall(webId, nameFilter, securityItem, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSecurityEntriesCall(String webId, String nameFilter, String securityItem, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/securityentries";
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
		if (nameFilter != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "nameFilter", nameFilter));
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
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
	 * Create a security entry owned by the asset database. 
	 *
	 */
	public void createSecurityEntry(String webId, PWASecurityEntry securityEntry, Boolean applyToChildren, String securityItem, String webIdType) throws ApiException {
		createSecurityEntryWithHttpInfo(webId, securityEntry, applyToChildren, securityItem, webIdType);
	}

	/**
	 * Create a security entry owned by the asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createSecurityEntryWithHttpInfo(String webId, PWASecurityEntry securityEntry, Boolean applyToChildren, String securityItem, String webIdType) throws ApiException {
		okhttp3.Call call = createSecurityEntryCall(webId, securityEntry, applyToChildren, securityItem, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a security entry owned by the asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call createSecurityEntryAsync(String webId, PWASecurityEntry securityEntry, Boolean applyToChildren, String securityItem, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createSecurityEntryCall(webId, securityEntry, applyToChildren, securityItem, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createSecurityEntryCall(String webId, PWASecurityEntry securityEntry, Boolean applyToChildren, String securityItem, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'securityEntry' is set
		if (securityEntry == null)
			throw new ApiException("Missing required parameter 'securityEntry'");
		String localVarPath = "/assetdatabases/{webId}/securityentries";
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
		localVarPostBody =  securityEntry;
		if (applyToChildren != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "applyToChildren", applyToChildren));
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
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
	 * Delete a security entry owned by the asset database. 
	 *
	 */
	public void deleteSecurityEntry(String name, String webId, Boolean applyToChildren, String securityItem) throws ApiException {
		deleteSecurityEntryWithHttpInfo(name, webId, applyToChildren, securityItem);
	}

	/**
	 * Delete a security entry owned by the asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> deleteSecurityEntryWithHttpInfo(String name, String webId, Boolean applyToChildren, String securityItem) throws ApiException {
		okhttp3.Call call = deleteSecurityEntryCall(name, webId, applyToChildren, securityItem,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Delete a security entry owned by the asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call deleteSecurityEntryAsync(String name, String webId, Boolean applyToChildren, String securityItem, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = deleteSecurityEntryCall(name, webId, applyToChildren, securityItem, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call deleteSecurityEntryCall(String name, String webId, Boolean applyToChildren, String securityItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'name' is set
		if (name == null)
			throw new ApiException("Missing required parameter 'name'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/securityentries/{name}";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{name\\}", apiClient.escapeString(name.toString()));
		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (applyToChildren != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "applyToChildren", applyToChildren));
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
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
		return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve the security entry of the specified security item associated with the asset database with the specified name. 
	 *
	 */
	public PWASecurityEntry getSecurityEntryByName(String name, String webId, String securityItem, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWASecurityEntry> resp = getSecurityEntryByNameWithHttpInfo(name, webId, securityItem, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve the security entry of the specified security item associated with the asset database with the specified name. (with HTTP information)
	 *
	 */
	public ApiResponse<PWASecurityEntry> getSecurityEntryByNameWithHttpInfo(String name, String webId, String securityItem, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getSecurityEntryByNameCall(name, webId, securityItem, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWASecurityEntry>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve the security entry of the specified security item associated with the asset database with the specified name. (asynchronously)
	 *
	 */
	public okhttp3.Call getSecurityEntryByNameAsync(String name, String webId, String securityItem, String selectedFields, String webIdType, final ApiCallback<PWASecurityEntry> callback) throws ApiException {
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
		okhttp3.Call call = getSecurityEntryByNameCall(name, webId, securityItem, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getSecurityEntryByNameCall(String name, String webId, String securityItem, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'name' is set
		if (name == null)
			throw new ApiException("Missing required parameter 'name'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/securityentries/{name}";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{name\\}", apiClient.escapeString(name.toString()));
		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
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
	 * Update a security entry owned by the asset database. 
	 *
	 */
	public void updateSecurityEntry(String name, String webId, PWASecurityEntry securityEntry, Boolean applyToChildren, String securityItem) throws ApiException {
		updateSecurityEntryWithHttpInfo(name, webId, securityEntry, applyToChildren, securityItem);
	}

	/**
	 * Update a security entry owned by the asset database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> updateSecurityEntryWithHttpInfo(String name, String webId, PWASecurityEntry securityEntry, Boolean applyToChildren, String securityItem) throws ApiException {
		okhttp3.Call call = updateSecurityEntryCall(name, webId, securityEntry, applyToChildren, securityItem,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Update a security entry owned by the asset database. (asynchronously)
	 *
	 */
	public okhttp3.Call updateSecurityEntryAsync(String name, String webId, PWASecurityEntry securityEntry, Boolean applyToChildren, String securityItem, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = updateSecurityEntryCall(name, webId, securityEntry, applyToChildren, securityItem, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call updateSecurityEntryCall(String name, String webId, PWASecurityEntry securityEntry, Boolean applyToChildren, String securityItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'name' is set
		if (name == null)
			throw new ApiException("Missing required parameter 'name'");
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'securityEntry' is set
		if (securityEntry == null)
			throw new ApiException("Missing required parameter 'securityEntry'");
		String localVarPath = "/assetdatabases/{webId}/securityentries/{name}";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{name\\}", apiClient.escapeString(name.toString()));
		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		localVarPostBody =  securityEntry;
		if (applyToChildren != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "applyToChildren", applyToChildren));
		if (securityItem != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "securityItem", securityItem));
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
		return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve table categories for a given Asset Database. 
	 *
	 */
	public PWAItemsTableCategory getTableCategories(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAItemsTableCategory> resp = getTableCategoriesWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve table categories for a given Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsTableCategory> getTableCategoriesWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getTableCategoriesCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsTableCategory>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve table categories for a given Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getTableCategoriesAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PWAItemsTableCategory> callback) throws ApiException {
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
		okhttp3.Call call = getTableCategoriesCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getTableCategoriesCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/tablecategories";
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
	 * Create a table category on the Asset Database. 
	 *
	 */
	public void createTableCategory(String webId, PWATableCategory tableCategory, String webIdType) throws ApiException {
		createTableCategoryWithHttpInfo(webId, tableCategory, webIdType);
	}

	/**
	 * Create a table category on the Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createTableCategoryWithHttpInfo(String webId, PWATableCategory tableCategory, String webIdType) throws ApiException {
		okhttp3.Call call = createTableCategoryCall(webId, tableCategory, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a table category on the Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call createTableCategoryAsync(String webId, PWATableCategory tableCategory, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createTableCategoryCall(webId, tableCategory, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createTableCategoryCall(String webId, PWATableCategory tableCategory, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'tableCategory' is set
		if (tableCategory == null)
			throw new ApiException("Missing required parameter 'tableCategory'");
		String localVarPath = "/assetdatabases/{webId}/tablecategories";
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
		localVarPostBody =  tableCategory;
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
	 * Retrieve tables for given Asset Database. 
	 *
	 */
	public PWAItemsTable getTables(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PWAItemsTable> resp = getTablesWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve tables for given Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<PWAItemsTable> getTablesWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getTablesCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PWAItemsTable>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve tables for given Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call getTablesAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PWAItemsTable> callback) throws ApiException {
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
		okhttp3.Call call = getTablesCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getTablesCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/assetdatabases/{webId}/tables";
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
	 * Create a table on the Asset Database. 
	 *
	 */
	public void createTable(String webId, PWATable table, String webIdType) throws ApiException {
		createTableWithHttpInfo(webId, table, webIdType);
	}

	/**
	 * Create a table on the Asset Database. (with HTTP information)
	 *
	 */
	public ApiResponse<Void> createTableWithHttpInfo(String webId, PWATable table, String webIdType) throws ApiException {
		okhttp3.Call call = createTableCall(webId, table, webIdType,null,null);
		return apiClient.execute(call);
	}

	/**
	 * Create a table on the Asset Database. (asynchronously)
	 *
	 */
	public okhttp3.Call createTableAsync(String webId, PWATable table, String webIdType, final ApiCallback<Void> callback) throws ApiException {
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
		okhttp3.Call call = createTableCall(webId, table, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call createTableCall(String webId, PWATable table, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		// verify the required parameter 'table' is set
		if (table == null)
			throw new ApiException("Missing required parameter 'table'");
		String localVarPath = "/assetdatabases/{webId}/tables";
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
		localVarPostBody =  table;
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

}
