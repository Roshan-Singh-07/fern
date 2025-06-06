/**
 * This file was auto-generated by Fern from our API Definition.
 */

package com.fern.sdk.resources.endpoints.primitive;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fern.sdk.core.ClientOptions;
import com.fern.sdk.core.MediaTypes;
import com.fern.sdk.core.ObjectMappers;
import com.fern.sdk.core.RequestOptions;
import com.fern.sdk.core.SeedExhaustiveApiException;
import com.fern.sdk.core.SeedExhaustiveException;
import com.fern.sdk.core.SeedExhaustiveHttpResponse;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.UUID;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class RawPrimitiveClient {
  protected final ClientOptions clientOptions;

  public RawPrimitiveClient(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  public SeedExhaustiveHttpResponse<String> getAndReturnString(String request) {
    return getAndReturnString(request,null);
  }

  public SeedExhaustiveHttpResponse<String> getAndReturnString(String request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegments("primitive")
      .addPathSegments("string")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(JsonProcessingException e) {
      throw new SeedExhaustiveException("Failed to serialize request", e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    try (Response response = client.newCall(okhttpRequest).execute()) {
      ResponseBody responseBody = response.body();
      if (response.isSuccessful()) {
        return new SeedExhaustiveHttpResponse<>(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), String.class), response);
      }
      String responseBodyString = responseBody != null ? responseBody.string() : "{}";
      throw new SeedExhaustiveApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
    }
    catch (IOException e) {
      throw new SeedExhaustiveException("Network error executing HTTP request", e);
    }
  }

  public SeedExhaustiveHttpResponse<Integer> getAndReturnInt(int request) {
    return getAndReturnInt(request,null);
  }

  public SeedExhaustiveHttpResponse<Integer> getAndReturnInt(int request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegments("primitive")
      .addPathSegments("integer")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(JsonProcessingException e) {
      throw new SeedExhaustiveException("Failed to serialize request", e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    try (Response response = client.newCall(okhttpRequest).execute()) {
      ResponseBody responseBody = response.body();
      if (response.isSuccessful()) {
        return new SeedExhaustiveHttpResponse<>(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), int.class), response);
      }
      String responseBodyString = responseBody != null ? responseBody.string() : "{}";
      throw new SeedExhaustiveApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
    }
    catch (IOException e) {
      throw new SeedExhaustiveException("Network error executing HTTP request", e);
    }
  }

  public SeedExhaustiveHttpResponse<Long> getAndReturnLong(long request) {
    return getAndReturnLong(request,null);
  }

  public SeedExhaustiveHttpResponse<Long> getAndReturnLong(long request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegments("primitive")
      .addPathSegments("long")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(JsonProcessingException e) {
      throw new SeedExhaustiveException("Failed to serialize request", e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    try (Response response = client.newCall(okhttpRequest).execute()) {
      ResponseBody responseBody = response.body();
      if (response.isSuccessful()) {
        return new SeedExhaustiveHttpResponse<>(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), long.class), response);
      }
      String responseBodyString = responseBody != null ? responseBody.string() : "{}";
      throw new SeedExhaustiveApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
    }
    catch (IOException e) {
      throw new SeedExhaustiveException("Network error executing HTTP request", e);
    }
  }

  public SeedExhaustiveHttpResponse<Double> getAndReturnDouble(double request) {
    return getAndReturnDouble(request,null);
  }

  public SeedExhaustiveHttpResponse<Double> getAndReturnDouble(double request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegments("primitive")
      .addPathSegments("double")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(JsonProcessingException e) {
      throw new SeedExhaustiveException("Failed to serialize request", e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    try (Response response = client.newCall(okhttpRequest).execute()) {
      ResponseBody responseBody = response.body();
      if (response.isSuccessful()) {
        return new SeedExhaustiveHttpResponse<>(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), double.class), response);
      }
      String responseBodyString = responseBody != null ? responseBody.string() : "{}";
      throw new SeedExhaustiveApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
    }
    catch (IOException e) {
      throw new SeedExhaustiveException("Network error executing HTTP request", e);
    }
  }

  public SeedExhaustiveHttpResponse<Boolean> getAndReturnBool(boolean request) {
    return getAndReturnBool(request,null);
  }

  public SeedExhaustiveHttpResponse<Boolean> getAndReturnBool(boolean request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegments("primitive")
      .addPathSegments("boolean")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(JsonProcessingException e) {
      throw new SeedExhaustiveException("Failed to serialize request", e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    try (Response response = client.newCall(okhttpRequest).execute()) {
      ResponseBody responseBody = response.body();
      if (response.isSuccessful()) {
        return new SeedExhaustiveHttpResponse<>(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), boolean.class), response);
      }
      String responseBodyString = responseBody != null ? responseBody.string() : "{}";
      throw new SeedExhaustiveApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
    }
    catch (IOException e) {
      throw new SeedExhaustiveException("Network error executing HTTP request", e);
    }
  }

  public SeedExhaustiveHttpResponse<OffsetDateTime> getAndReturnDatetime(OffsetDateTime request) {
    return getAndReturnDatetime(request,null);
  }

  public SeedExhaustiveHttpResponse<OffsetDateTime> getAndReturnDatetime(OffsetDateTime request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegments("primitive")
      .addPathSegments("datetime")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(JsonProcessingException e) {
      throw new SeedExhaustiveException("Failed to serialize request", e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    try (Response response = client.newCall(okhttpRequest).execute()) {
      ResponseBody responseBody = response.body();
      if (response.isSuccessful()) {
        return new SeedExhaustiveHttpResponse<>(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), OffsetDateTime.class), response);
      }
      String responseBodyString = responseBody != null ? responseBody.string() : "{}";
      throw new SeedExhaustiveApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
    }
    catch (IOException e) {
      throw new SeedExhaustiveException("Network error executing HTTP request", e);
    }
  }

  public SeedExhaustiveHttpResponse<String> getAndReturnDate(String request) {
    return getAndReturnDate(request,null);
  }

  public SeedExhaustiveHttpResponse<String> getAndReturnDate(String request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegments("primitive")
      .addPathSegments("date")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(JsonProcessingException e) {
      throw new SeedExhaustiveException("Failed to serialize request", e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    try (Response response = client.newCall(okhttpRequest).execute()) {
      ResponseBody responseBody = response.body();
      if (response.isSuccessful()) {
        return new SeedExhaustiveHttpResponse<>(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), String.class), response);
      }
      String responseBodyString = responseBody != null ? responseBody.string() : "{}";
      throw new SeedExhaustiveApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
    }
    catch (IOException e) {
      throw new SeedExhaustiveException("Network error executing HTTP request", e);
    }
  }

  public SeedExhaustiveHttpResponse<UUID> getAndReturnUuid(UUID request) {
    return getAndReturnUuid(request,null);
  }

  public SeedExhaustiveHttpResponse<UUID> getAndReturnUuid(UUID request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegments("primitive")
      .addPathSegments("uuid")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(JsonProcessingException e) {
      throw new SeedExhaustiveException("Failed to serialize request", e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    try (Response response = client.newCall(okhttpRequest).execute()) {
      ResponseBody responseBody = response.body();
      if (response.isSuccessful()) {
        return new SeedExhaustiveHttpResponse<>(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), UUID.class), response);
      }
      String responseBodyString = responseBody != null ? responseBody.string() : "{}";
      throw new SeedExhaustiveApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
    }
    catch (IOException e) {
      throw new SeedExhaustiveException("Network error executing HTTP request", e);
    }
  }

  public SeedExhaustiveHttpResponse<byte[]> getAndReturnBase64(byte[] request) {
    return getAndReturnBase64(request,null);
  }

  public SeedExhaustiveHttpResponse<byte[]> getAndReturnBase64(byte[] request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegments("primitive")
      .addPathSegments("base64")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(JsonProcessingException e) {
      throw new SeedExhaustiveException("Failed to serialize request", e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    try (Response response = client.newCall(okhttpRequest).execute()) {
      ResponseBody responseBody = response.body();
      if (response.isSuccessful()) {
        return new SeedExhaustiveHttpResponse<>(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), byte[].class), response);
      }
      String responseBodyString = responseBody != null ? responseBody.string() : "{}";
      throw new SeedExhaustiveApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
    }
    catch (IOException e) {
      throw new SeedExhaustiveException("Network error executing HTTP request", e);
    }
  }
}
