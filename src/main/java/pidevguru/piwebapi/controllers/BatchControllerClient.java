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

public class BatchControllerClient {
	private ApiClient apiClient;
	public BatchControllerClient(ApiClient apiClient){
		this.apiClient = apiClient;
	}
	public ApiClient getApiClient() {
		return apiClient;
	}
	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}
	/**
	 * Execute a batch of requests against the service. As shown in the Sample Request, the input is a dictionary with IDs as keys and request objects as values. Each request object specifies the HTTP method and the resource and, optionally, the content and a list of parent IDs. The list of parent IDs specifies which other requests must complete before the given request will be executed. The example first creates an element, then gets the element by the response's Location header, then creates an attribute for the element. Note that the resource can be an absolute URL or a JsonPath that references the response to the parent request. The batch's response is a dictionary uses keys corresponding those provided in the request, with response objects containing a status code, response headers, and the response body. A request can alternatively specify a request template in place of a resource. In this case, a single JsonPath may select multiple tokens, and a separate subrequest will be made from the template for each token. The responses of these subrequests will returned as the content of a single outer response. 
	 *
	 */
	public Map<String, PWAResponse> execute(Map<String, PWARequest> batch) throws ApiException {
		ApiResponse<Map<String, PWAResponse>> resp = executeWithHttpInfo(batch);
		return resp.getData();
	}

	/**
	 * Execute a batch of requests against the service. As shown in the Sample Request, the input is a dictionary with IDs as keys and request objects as values. Each request object specifies the HTTP method and the resource and, optionally, the content and a list of parent IDs. The list of parent IDs specifies which other requests must complete before the given request will be executed. The example first creates an element, then gets the element by the response's Location header, then creates an attribute for the element. Note that the resource can be an absolute URL or a JsonPath that references the response to the parent request. The batch's response is a dictionary uses keys corresponding those provided in the request, with response objects containing a status code, response headers, and the response body. A request can alternatively specify a request template in place of a resource. In this case, a single JsonPath may select multiple tokens, and a separate subrequest will be made from the template for each token. The responses of these subrequests will returned as the content of a single outer response. (with HTTP information)
	 *
	 */
	public ApiResponse<Map<String, PWAResponse>> executeWithHttpInfo(Map<String, PWARequest> batch) throws ApiException {
		okhttp3.Call call = executeCall(batch,null,null);
		Type localVarReturnType = new TypeToken<Map<String, PWAResponse>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Execute a batch of requests against the service. As shown in the Sample Request, the input is a dictionary with IDs as keys and request objects as values. Each request object specifies the HTTP method and the resource and, optionally, the content and a list of parent IDs. The list of parent IDs specifies which other requests must complete before the given request will be executed. The example first creates an element, then gets the element by the response's Location header, then creates an attribute for the element. Note that the resource can be an absolute URL or a JsonPath that references the response to the parent request. The batch's response is a dictionary uses keys corresponding those provided in the request, with response objects containing a status code, response headers, and the response body. A request can alternatively specify a request template in place of a resource. In this case, a single JsonPath may select multiple tokens, and a separate subrequest will be made from the template for each token. The responses of these subrequests will returned as the content of a single outer response. (asynchronously)
	 *
	 */
	public okhttp3.Call executeAsync(Map<String, PWARequest> batch, final ApiCallback<Map<String, PWAResponse>> callback) throws ApiException {
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
		okhttp3.Call call = executeCall(batch, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call executeCall(Map<String, PWARequest> batch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'batch' is set
		if (batch == null)
			throw new ApiException("Missing required parameter 'batch'");
		String localVarPath = "/batch";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPostBody =  batch;
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
