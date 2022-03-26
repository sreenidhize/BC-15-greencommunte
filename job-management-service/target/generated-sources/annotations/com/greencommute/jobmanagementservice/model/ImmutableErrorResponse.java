package com.greencommute.jobmanagementservice.model;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Longs;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AbstractErrorResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorResponse.builder()}.
 */
@Generated(from = "AbstractErrorResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableErrorResponse
    extends AbstractErrorResponse {
  private final long timeStamp;
  private final String errorMessage;
  private final int statusCode;
  private final String description;

  private ImmutableErrorResponse(long timeStamp, String errorMessage, int statusCode, String description) {
    this.timeStamp = timeStamp;
    this.errorMessage = errorMessage;
    this.statusCode = statusCode;
    this.description = description;
  }

  /**
   * @return The value of the {@code timeStamp} attribute
   */
  @Override
  public long getTimeStamp() {
    return timeStamp;
  }

  /**
   * @return The value of the {@code errorMessage} attribute
   */
  @Override
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * @return The value of the {@code statusCode} attribute
   */
  @Override
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @Override
  public String getDescription() {
    return description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractErrorResponse#getTimeStamp() timeStamp} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timeStamp
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorResponse withTimeStamp(long value) {
    if (this.timeStamp == value) return this;
    return new ImmutableErrorResponse(value, this.errorMessage, this.statusCode, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractErrorResponse#getErrorMessage() errorMessage} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorMessage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorResponse withErrorMessage(String value) {
    String newValue = Objects.requireNonNull(value, "errorMessage");
    if (this.errorMessage.equals(newValue)) return this;
    return new ImmutableErrorResponse(this.timeStamp, newValue, this.statusCode, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractErrorResponse#getStatusCode() statusCode} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for statusCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorResponse withStatusCode(int value) {
    if (this.statusCode == value) return this;
    return new ImmutableErrorResponse(this.timeStamp, this.errorMessage, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractErrorResponse#getDescription() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorResponse withDescription(String value) {
    String newValue = Objects.requireNonNull(value, "description");
    if (this.description.equals(newValue)) return this;
    return new ImmutableErrorResponse(this.timeStamp, this.errorMessage, this.statusCode, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorResponse
        && equalTo((ImmutableErrorResponse) another);
  }

  private boolean equalTo(ImmutableErrorResponse another) {
    return timeStamp == another.timeStamp
        && errorMessage.equals(another.errorMessage)
        && statusCode == another.statusCode
        && description.equals(another.description);
  }

  /**
   * Computes a hash code from attributes: {@code timeStamp}, {@code errorMessage}, {@code statusCode}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(timeStamp);
    h += (h << 5) + errorMessage.hashCode();
    h += (h << 5) + statusCode;
    h += (h << 5) + description.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorResponse")
        .omitNullValues()
        .add("timeStamp", timeStamp)
        .add("errorMessage", errorMessage)
        .add("statusCode", statusCode)
        .add("description", description)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link AbstractErrorResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorResponse instance
   */
  public static ImmutableErrorResponse copyOf(AbstractErrorResponse instance) {
    if (instance instanceof ImmutableErrorResponse) {
      return (ImmutableErrorResponse) instance;
    }
    return ImmutableErrorResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorResponse ImmutableErrorResponse}.
   * <pre>
   * ImmutableErrorResponse.builder()
   *    .timeStamp(long) // required {@link AbstractErrorResponse#getTimeStamp() timeStamp}
   *    .errorMessage(String) // required {@link AbstractErrorResponse#getErrorMessage() errorMessage}
   *    .statusCode(int) // required {@link AbstractErrorResponse#getStatusCode() statusCode}
   *    .description(String) // required {@link AbstractErrorResponse#getDescription() description}
   *    .build();
   * </pre>
   * @return A new ImmutableErrorResponse builder
   */
  public static ImmutableErrorResponse.Builder builder() {
    return new ImmutableErrorResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorResponse ImmutableErrorResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AbstractErrorResponse", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_TIME_STAMP = 0x1L;
    private static final long INIT_BIT_ERROR_MESSAGE = 0x2L;
    private static final long INIT_BIT_STATUS_CODE = 0x4L;
    private static final long INIT_BIT_DESCRIPTION = 0x8L;
    private long initBits = 0xfL;

    private long timeStamp;
    private String errorMessage;
    private int statusCode;
    private String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractErrorResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AbstractErrorResponse instance) {
      Objects.requireNonNull(instance, "instance");
      timeStamp(instance.getTimeStamp());
      errorMessage(instance.getErrorMessage());
      statusCode(instance.getStatusCode());
      description(instance.getDescription());
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractErrorResponse#getTimeStamp() timeStamp} attribute.
     * @param timeStamp The value for timeStamp 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timeStamp(long timeStamp) {
      this.timeStamp = timeStamp;
      initBits &= ~INIT_BIT_TIME_STAMP;
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractErrorResponse#getErrorMessage() errorMessage} attribute.
     * @param errorMessage The value for errorMessage 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorMessage(String errorMessage) {
      this.errorMessage = Objects.requireNonNull(errorMessage, "errorMessage");
      initBits &= ~INIT_BIT_ERROR_MESSAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractErrorResponse#getStatusCode() statusCode} attribute.
     * @param statusCode The value for statusCode 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder statusCode(int statusCode) {
      this.statusCode = statusCode;
      initBits &= ~INIT_BIT_STATUS_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractErrorResponse#getDescription() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorResponse ImmutableErrorResponse}.
     * @return An immutable instance of ErrorResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorResponse(timeStamp, errorMessage, statusCode, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_TIME_STAMP) != 0) attributes.add("timeStamp");
      if ((initBits & INIT_BIT_ERROR_MESSAGE) != 0) attributes.add("errorMessage");
      if ((initBits & INIT_BIT_STATUS_CODE) != 0) attributes.add("statusCode");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      return "Cannot build ErrorResponse, some of required attributes are not set " + attributes;
    }
  }
}
