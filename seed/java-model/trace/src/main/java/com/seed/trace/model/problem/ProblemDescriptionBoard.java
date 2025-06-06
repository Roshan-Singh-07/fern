/**
 * This file was auto-generated by Fern from our API Definition.
 */

package com.seed.trace.model.problem;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public final class ProblemDescriptionBoard {
  private final Value value;

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  private ProblemDescriptionBoard(Value value) {
    this.value = value;
  }

  public <T> T visit(Visitor<T> visitor) {
    return value.visit(visitor);
  }

  public static ProblemDescriptionBoard html(String value) {
    return new ProblemDescriptionBoard(new HtmlValue(value));
  }

  public static ProblemDescriptionBoard variable(com.seed.trace.model.commons.VariableValue value) {
    return new ProblemDescriptionBoard(new VariableValue(value));
  }

  public static ProblemDescriptionBoard testCaseId(String value) {
    return new ProblemDescriptionBoard(new TestCaseIdValue(value));
  }

  public boolean isHtml() {
    return value instanceof HtmlValue;
  }

  public boolean isVariable() {
    return value instanceof VariableValue;
  }

  public boolean isTestCaseId() {
    return value instanceof TestCaseIdValue;
  }

  public boolean _isUnknown() {
    return value instanceof _UnknownValue;
  }

  public Optional<String> getHtml() {
    if (isHtml()) {
      return Optional.of(((HtmlValue) value).value);
    }
    return Optional.empty();
  }

  public Optional<com.seed.trace.model.commons.VariableValue> getVariable() {
    if (isVariable()) {
      return Optional.of(((VariableValue) value).value);
    }
    return Optional.empty();
  }

  public Optional<String> getTestCaseId() {
    if (isTestCaseId()) {
      return Optional.of(((TestCaseIdValue) value).value);
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
    T visitHtml(String html);

    T visitVariable(com.seed.trace.model.commons.VariableValue variable);

    T visitTestCaseId(String testCaseId);

    T _visitUnknown(Object unknownType);
  }

  @JsonTypeInfo(
      use = JsonTypeInfo.Id.NAME,
      property = "type",
      visible = true,
      defaultImpl = _UnknownValue.class
  )
  @JsonSubTypes({
      @JsonSubTypes.Type(HtmlValue.class),
      @JsonSubTypes.Type(VariableValue.class),
      @JsonSubTypes.Type(TestCaseIdValue.class)
  })
  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  private interface Value {
    <T> T visit(Visitor<T> visitor);
  }

  @JsonTypeName("html")
  @JsonIgnoreProperties("type")
  private static final class HtmlValue implements Value {
    @JsonProperty("value")
    private String value;

    @JsonCreator(
        mode = JsonCreator.Mode.PROPERTIES
    )
    private HtmlValue(@JsonProperty("value") String value) {
      this.value = value;
    }

    @java.lang.Override
    public <T> T visit(Visitor<T> visitor) {
      return visitor.visitHtml(value);
    }

    @java.lang.Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof HtmlValue && equalTo((HtmlValue) other);
    }

    private boolean equalTo(HtmlValue other) {
      return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
      return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
      return "ProblemDescriptionBoard{" + "value: " + value + "}";
    }
  }

  @JsonTypeName("variable")
  @JsonIgnoreProperties("type")
  private static final class VariableValue implements Value {
    @JsonProperty("value")
    private com.seed.trace.model.commons.VariableValue value;

    @JsonCreator(
        mode = JsonCreator.Mode.PROPERTIES
    )
    private VariableValue(@JsonProperty("value") com.seed.trace.model.commons.VariableValue value) {
      this.value = value;
    }

    @java.lang.Override
    public <T> T visit(Visitor<T> visitor) {
      return visitor.visitVariable(value);
    }

    @java.lang.Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof VariableValue && equalTo((VariableValue) other);
    }

    private boolean equalTo(VariableValue other) {
      return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
      return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
      return "ProblemDescriptionBoard{" + "value: " + value + "}";
    }
  }

  @JsonTypeName("testCaseId")
  @JsonIgnoreProperties("type")
  private static final class TestCaseIdValue implements Value {
    @JsonProperty("value")
    private String value;

    @JsonCreator(
        mode = JsonCreator.Mode.PROPERTIES
    )
    private TestCaseIdValue(@JsonProperty("value") String value) {
      this.value = value;
    }

    @java.lang.Override
    public <T> T visit(Visitor<T> visitor) {
      return visitor.visitTestCaseId(value);
    }

    @java.lang.Override
    public boolean equals(Object other) {
      if (this == other) return true;
      return other instanceof TestCaseIdValue && equalTo((TestCaseIdValue) other);
    }

    private boolean equalTo(TestCaseIdValue other) {
      return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
      return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
      return "ProblemDescriptionBoard{" + "value: " + value + "}";
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
      return "ProblemDescriptionBoard{" + "type: " + type + ", value: " + value + "}";
    }
  }
}
