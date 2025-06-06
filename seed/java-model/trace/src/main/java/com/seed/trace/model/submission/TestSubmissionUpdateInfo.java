/**
 * This file was auto-generated by Fern from our API Definition.
 */

package com.seed.trace.model.submission;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class TestSubmissionUpdateInfo {
  private final Value value;

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  private TestSubmissionUpdateInfo(Value value) {
    this.value = value;
  }

  public <T> T visit(Visitor<T> visitor) {
    return value.visit(visitor);
  }

  public static TestSubmissionUpdateInfo running(RunningSubmissionState value) {
    return new TestSubmissionUpdateInfo(new RunningValue(value));
  }

  public static TestSubmissionUpdateInfo stopped() {
    return new TestSubmissionUpdateInfo(new StoppedValue());
  }

  public static TestSubmissionUpdateInfo errored(ErrorInfo value) {
    return new TestSubmissionUpdateInfo(new ErroredValue(value));
  }

  public static TestSubmissionUpdateInfo gradedTestCase(GradedTestCaseUpdate value) {
    return new TestSubmissionUpdateInfo(new GradedTestCaseValue(value));
  }

  public static TestSubmissionUpdateInfo recordedTestCase(RecordedTestCaseUpdate value) {
    return new TestSubmissionUpdateInfo(new RecordedTestCaseValue(value));
  }

  public static TestSubmissionUpdateInfo finished() {
    return new TestSubmissionUpdateInfo(new FinishedValue());
  }

  public boolean isRunning() {
    return value instanceof RunningValue;
  }

  public boolean isStopped() {
    return value instanceof StoppedValue;
  }

  public boolean isErrored() {
    return value instanceof ErroredValue;
  }

  public boolean isGradedTestCase() {
    return value instanceof GradedTestCaseValue;
  }

  public boolean isRecordedTestCase() {
    return value instanceof RecordedTestCaseValue;
  }

  public boolean isFinished() {
    return value instanceof FinishedValue;
  }

  public boolean _isUnknown() {
    return value instanceof _UnknownValue;
  }

  public Optional<RunningSubmissionState> getRunning() {
    if (isRunning()) {
      return Optional.of(((RunningValue) value).value);
    }
    return Optional.empty();
  }

  public Optional<ErrorInfo> getErrored() {
    if (isErrored()) {
      return Optional.of(((ErroredValue) value).value);
    }
    return Optional.empty();
  }

  public Optional<GradedTestCaseUpdate> getGradedTestCase() {
    if (isGradedTestCase()) {
      return Optional.of(((GradedTestCaseValue) value).value);
    }
    return Optional.empty();
  }

  public Optional<RecordedTestCaseUpdate> getRecordedTestCase() {
    if (isRecordedTestCase()) {
      return Optional.of(((RecordedTestCaseValue) value).value);
    }
    return Optional.empty();
  }

  public Optional<Object> _getUnknown() {
    if (_isUnknown()) {
      return Optional.of(((_UnknownValue) value).value);
    }
    return Optional.empty();
  }

  @JsonValue
  private Value getValue() {
    return this.value;
  }

  public interface Visitor<T> {
    T visitRunning(RunningSubmissionState running);

    T visitStopped();

    T visitErrored(ErrorInfo errored);

    T visitGradedTestCase(GradedTestCaseUpdate gradedTestCase);

    T visitRecordedTestCase(RecordedTestCaseUpdate recordedTestCase);

    T visitFinished();

    T _visitUnknown(Object unknownType);
  }

  @JsonTypeInfo(
      use = JsonTypeInfo.Id.NAME,
      property = "type",
      visible = true,
      defaultImpl = _UnknownValue.class
  )
  @JsonSubTypes({
      @JsonSubTypes.Type(RunningValue.class),
      @JsonSubTypes.Type(StoppedValue.class),
      @JsonSubTypes.Type(ErroredValue.class),
      @JsonSubTypes.Type(GradedTestCaseValue.class),
      @JsonSubTypes.Type(RecordedTestCaseValue.class),
      @JsonSubTypes.Type(FinishedValue.class)
  })
  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  private interface Value {
    <T> T visit(Visitor<T> visitor);
  }

  @JsonTypeName("running")
  @JsonIgnoreProperties("type")
  private static final class RunningValue implements Value {
    @JsonProperty("value")
    private RunningSubmissionState value;

    @JsonCreator(
        mode = JsonCreator.Mode.PROPERTIES
    )
    private RunningValue(@JsonProperty("value") RunningSubmissionState value) {
      this.value = value;
    }

    @java.lang.Override
    public <T> T visit(Visitor<T> visitor) {
      return visitor.visitRunning(value);
    }

    @java.lang.Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof RunningValue && equalTo((RunningValue) other);
    }

    private boolean equalTo(RunningValue other) {
      return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
      return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
      return "TestSubmissionUpdateInfo{" + "value: " + value + "}";
    }
  }

  @JsonTypeName("stopped")
  @JsonIgnoreProperties("type")
  private static final class StoppedValue implements Value {
    @JsonCreator(
        mode = JsonCreator.Mode.PROPERTIES
    )
    private StoppedValue() {
    }

    @java.lang.Override
    public <T> T visit(Visitor<T> visitor) {
      return visitor.visitStopped();
    }

    @java.lang.Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof StoppedValue;
    }

    @java.lang.Override
    public String toString() {
      return "TestSubmissionUpdateInfo{" + "}";
    }
  }

  @JsonTypeName("errored")
  @JsonIgnoreProperties("type")
  private static final class ErroredValue implements Value {
    @JsonProperty("value")
    private ErrorInfo value;

    @JsonCreator(
        mode = JsonCreator.Mode.PROPERTIES
    )
    private ErroredValue(@JsonProperty("value") ErrorInfo value) {
      this.value = value;
    }

    @java.lang.Override
    public <T> T visit(Visitor<T> visitor) {
      return visitor.visitErrored(value);
    }

    @java.lang.Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof ErroredValue && equalTo((ErroredValue) other);
    }

    private boolean equalTo(ErroredValue other) {
      return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
      return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
      return "TestSubmissionUpdateInfo{" + "value: " + value + "}";
    }
  }

  @JsonTypeName("gradedTestCase")
  @JsonIgnoreProperties("type")
  private static final class GradedTestCaseValue implements Value {
    @JsonUnwrapped
    private GradedTestCaseUpdate value;

    @JsonCreator(
        mode = JsonCreator.Mode.PROPERTIES
    )
    private GradedTestCaseValue() {
    }

    private GradedTestCaseValue(GradedTestCaseUpdate value) {
      this.value = value;
    }

    @java.lang.Override
    public <T> T visit(Visitor<T> visitor) {
      return visitor.visitGradedTestCase(value);
    }

    @java.lang.Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof GradedTestCaseValue && equalTo((GradedTestCaseValue) other);
    }

    private boolean equalTo(GradedTestCaseValue other) {
      return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
      return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
      return "TestSubmissionUpdateInfo{" + "value: " + value + "}";
    }
  }

  @JsonTypeName("recordedTestCase")
  @JsonIgnoreProperties("type")
  private static final class RecordedTestCaseValue implements Value {
    @JsonUnwrapped
    private RecordedTestCaseUpdate value;

    @JsonCreator(
        mode = JsonCreator.Mode.PROPERTIES
    )
    private RecordedTestCaseValue() {
    }

    private RecordedTestCaseValue(RecordedTestCaseUpdate value) {
      this.value = value;
    }

    @java.lang.Override
    public <T> T visit(Visitor<T> visitor) {
      return visitor.visitRecordedTestCase(value);
    }

    @java.lang.Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof RecordedTestCaseValue && equalTo((RecordedTestCaseValue) other);
    }

    private boolean equalTo(RecordedTestCaseValue other) {
      return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
      return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
      return "TestSubmissionUpdateInfo{" + "value: " + value + "}";
    }
  }

  @JsonTypeName("finished")
  @JsonIgnoreProperties("type")
  private static final class FinishedValue implements Value {
    @JsonCreator(
        mode = JsonCreator.Mode.PROPERTIES
    )
    private FinishedValue() {
    }

    @java.lang.Override
    public <T> T visit(Visitor<T> visitor) {
      return visitor.visitFinished();
    }

    @java.lang.Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof FinishedValue;
    }

    @java.lang.Override
    public String toString() {
      return "TestSubmissionUpdateInfo{" + "}";
    }
  }

  @JsonIgnoreProperties("type")
  private static final class _UnknownValue implements Value {
    private String type;

    @JsonValue
    private Object value;

    @JsonCreator(
        mode = JsonCreator.Mode.PROPERTIES
    )
    private _UnknownValue(@JsonProperty("value") Object value) {
    }

    @java.lang.Override
    public <T> T visit(Visitor<T> visitor) {
      return visitor._visitUnknown(value);
    }

    @java.lang.Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
    }

    private boolean equalTo(_UnknownValue other) {
      return type.equals(other.type) && value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
      return Objects.hash(this.type, this.value);
    }

    @java.lang.Override
    public String toString() {
      return "TestSubmissionUpdateInfo{" + "type: " + type + ", value: " + value + "}";
    }
  }
}
