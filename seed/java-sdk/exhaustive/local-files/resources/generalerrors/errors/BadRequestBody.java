/**
 * This file was auto-generated by Fern from our API Definition.
 */

package com.fern.sdk.resources.generalerrors.errors;

import com.fern.sdk.core.SeedExhaustiveApiException;
import com.fern.sdk.resources.generalerrors.types.BadObjectRequestInfo;
import okhttp3.Response;

public final class BadRequestBody extends SeedExhaustiveApiException {
  /**
   * The body of the response that triggered the exception.
   */
  private final BadObjectRequestInfo body;

  public BadRequestBody(BadObjectRequestInfo body) {
    super("BadRequestBody", 400, body);
    this.body = body;
  }

  public BadRequestBody(BadObjectRequestInfo body, Response rawResponse) {
    super("BadRequestBody", 400, body, rawResponse);
    this.body = body;
  }

  /**
   * @return the body
   */
  @java.lang.Override
  public BadObjectRequestInfo body() {
    return this.body;
  }
}
