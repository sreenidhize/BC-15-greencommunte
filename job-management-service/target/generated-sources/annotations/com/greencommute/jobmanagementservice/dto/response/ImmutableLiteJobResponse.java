package com.greencommute.jobmanagementservice.dto.response;

import com.google.common.base.MoreObjects;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link LiteJobResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLiteJobResponse.builder()}.
 */
@Generated(from = "LiteJobResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableLiteJobResponse
    extends LiteJobResponse {
  private final UUID iD;
  private final String title;
  private final LocalDate datePosted;
  private final String address;
  private final String companyLogoUrl;
  private final String companyName;

  private ImmutableLiteJobResponse(
      UUID iD,
      String title,
      LocalDate datePosted,
      String address,
      String companyLogoUrl,
      String companyName) {
    this.iD = iD;
    this.title = title;
    this.datePosted = datePosted;
    this.address = address;
    this.companyLogoUrl = companyLogoUrl;
    this.companyName = companyName;
  }

  /**
   * @return The value of the {@code iD} attribute
   */
  @Override
  public UUID getID() {
    return iD;
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @Override
  public String getTitle() {
    return title;
  }

  /**
   * @return The value of the {@code datePosted} attribute
   */
  @Override
  public LocalDate getDatePosted() {
    return datePosted;
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @Override
  public String getAddress() {
    return address;
  }

  /**
   * @return The value of the {@code companyLogoUrl} attribute
   */
  @Override
  public String getCompanyLogoUrl() {
    return companyLogoUrl;
  }

  /**
   * @return The value of the {@code companyName} attribute
   */
  @Override
  public String getCompanyName() {
    return companyName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiteJobResponse#getID() iD} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for iD
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLiteJobResponse withID(UUID value) {
    if (this.iD == value) return this;
    UUID newValue = Objects.requireNonNull(value, "iD");
    return new ImmutableLiteJobResponse(newValue, this.title, this.datePosted, this.address, this.companyLogoUrl, this.companyName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiteJobResponse#getTitle() title} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for title
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLiteJobResponse withTitle(String value) {
    String newValue = Objects.requireNonNull(value, "title");
    if (this.title.equals(newValue)) return this;
    return new ImmutableLiteJobResponse(this.iD, newValue, this.datePosted, this.address, this.companyLogoUrl, this.companyName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiteJobResponse#getDatePosted() datePosted} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for datePosted
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLiteJobResponse withDatePosted(LocalDate value) {
    if (this.datePosted == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "datePosted");
    return new ImmutableLiteJobResponse(this.iD, this.title, newValue, this.address, this.companyLogoUrl, this.companyName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiteJobResponse#getAddress() address} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for address
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLiteJobResponse withAddress(String value) {
    String newValue = Objects.requireNonNull(value, "address");
    if (this.address.equals(newValue)) return this;
    return new ImmutableLiteJobResponse(this.iD, this.title, this.datePosted, newValue, this.companyLogoUrl, this.companyName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiteJobResponse#getCompanyLogoUrl() companyLogoUrl} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for companyLogoUrl
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLiteJobResponse withCompanyLogoUrl(String value) {
    String newValue = Objects.requireNonNull(value, "companyLogoUrl");
    if (this.companyLogoUrl.equals(newValue)) return this;
    return new ImmutableLiteJobResponse(this.iD, this.title, this.datePosted, this.address, newValue, this.companyName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiteJobResponse#getCompanyName() companyName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for companyName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLiteJobResponse withCompanyName(String value) {
    String newValue = Objects.requireNonNull(value, "companyName");
    if (this.companyName.equals(newValue)) return this;
    return new ImmutableLiteJobResponse(this.iD, this.title, this.datePosted, this.address, this.companyLogoUrl, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLiteJobResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLiteJobResponse
        && equalTo((ImmutableLiteJobResponse) another);
  }

  private boolean equalTo(ImmutableLiteJobResponse another) {
    return iD.equals(another.iD)
        && title.equals(another.title)
        && datePosted.equals(another.datePosted)
        && address.equals(another.address)
        && companyLogoUrl.equals(another.companyLogoUrl)
        && companyName.equals(another.companyName);
  }

  /**
   * Computes a hash code from attributes: {@code iD}, {@code title}, {@code datePosted}, {@code address}, {@code companyLogoUrl}, {@code companyName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + iD.hashCode();
    h += (h << 5) + title.hashCode();
    h += (h << 5) + datePosted.hashCode();
    h += (h << 5) + address.hashCode();
    h += (h << 5) + companyLogoUrl.hashCode();
    h += (h << 5) + companyName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LiteJobResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("LiteJobResponse")
        .omitNullValues()
        .add("iD", iD)
        .add("title", title)
        .add("datePosted", datePosted)
        .add("address", address)
        .add("companyLogoUrl", companyLogoUrl)
        .add("companyName", companyName)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link LiteJobResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LiteJobResponse instance
   */
  public static ImmutableLiteJobResponse copyOf(LiteJobResponse instance) {
    if (instance instanceof ImmutableLiteJobResponse) {
      return (ImmutableLiteJobResponse) instance;
    }
    return ImmutableLiteJobResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLiteJobResponse ImmutableLiteJobResponse}.
   * <pre>
   * ImmutableLiteJobResponse.builder()
   *    .iD(UUID) // required {@link LiteJobResponse#getID() iD}
   *    .title(String) // required {@link LiteJobResponse#getTitle() title}
   *    .datePosted(java.time.LocalDate) // required {@link LiteJobResponse#getDatePosted() datePosted}
   *    .address(String) // required {@link LiteJobResponse#getAddress() address}
   *    .companyLogoUrl(String) // required {@link LiteJobResponse#getCompanyLogoUrl() companyLogoUrl}
   *    .companyName(String) // required {@link LiteJobResponse#getCompanyName() companyName}
   *    .build();
   * </pre>
   * @return A new ImmutableLiteJobResponse builder
   */
  public static ImmutableLiteJobResponse.Builder builder() {
    return new ImmutableLiteJobResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLiteJobResponse ImmutableLiteJobResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "LiteJobResponse", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_I_D = 0x1L;
    private static final long INIT_BIT_TITLE = 0x2L;
    private static final long INIT_BIT_DATE_POSTED = 0x4L;
    private static final long INIT_BIT_ADDRESS = 0x8L;
    private static final long INIT_BIT_COMPANY_LOGO_URL = 0x10L;
    private static final long INIT_BIT_COMPANY_NAME = 0x20L;
    private long initBits = 0x3fL;

    private UUID iD;
    private String title;
    private LocalDate datePosted;
    private String address;
    private String companyLogoUrl;
    private String companyName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LiteJobResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(LiteJobResponse instance) {
      Objects.requireNonNull(instance, "instance");
      iD(instance.getID());
      title(instance.getTitle());
      datePosted(instance.getDatePosted());
      address(instance.getAddress());
      companyLogoUrl(instance.getCompanyLogoUrl());
      companyName(instance.getCompanyName());
      return this;
    }

    /**
     * Initializes the value for the {@link LiteJobResponse#getID() iD} attribute.
     * @param iD The value for iD 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder iD(UUID iD) {
      this.iD = Objects.requireNonNull(iD, "iD");
      initBits &= ~INIT_BIT_I_D;
      return this;
    }

    /**
     * Initializes the value for the {@link LiteJobResponse#getTitle() title} attribute.
     * @param title The value for title 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder title(String title) {
      this.title = Objects.requireNonNull(title, "title");
      initBits &= ~INIT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the value for the {@link LiteJobResponse#getDatePosted() datePosted} attribute.
     * @param datePosted The value for datePosted 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder datePosted(LocalDate datePosted) {
      this.datePosted = Objects.requireNonNull(datePosted, "datePosted");
      initBits &= ~INIT_BIT_DATE_POSTED;
      return this;
    }

    /**
     * Initializes the value for the {@link LiteJobResponse#getAddress() address} attribute.
     * @param address The value for address 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder address(String address) {
      this.address = Objects.requireNonNull(address, "address");
      initBits &= ~INIT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the value for the {@link LiteJobResponse#getCompanyLogoUrl() companyLogoUrl} attribute.
     * @param companyLogoUrl The value for companyLogoUrl 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder companyLogoUrl(String companyLogoUrl) {
      this.companyLogoUrl = Objects.requireNonNull(companyLogoUrl, "companyLogoUrl");
      initBits &= ~INIT_BIT_COMPANY_LOGO_URL;
      return this;
    }

    /**
     * Initializes the value for the {@link LiteJobResponse#getCompanyName() companyName} attribute.
     * @param companyName The value for companyName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder companyName(String companyName) {
      this.companyName = Objects.requireNonNull(companyName, "companyName");
      initBits &= ~INIT_BIT_COMPANY_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableLiteJobResponse ImmutableLiteJobResponse}.
     * @return An immutable instance of LiteJobResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLiteJobResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLiteJobResponse(iD, title, datePosted, address, companyLogoUrl, companyName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_I_D) != 0) attributes.add("iD");
      if ((initBits & INIT_BIT_TITLE) != 0) attributes.add("title");
      if ((initBits & INIT_BIT_DATE_POSTED) != 0) attributes.add("datePosted");
      if ((initBits & INIT_BIT_ADDRESS) != 0) attributes.add("address");
      if ((initBits & INIT_BIT_COMPANY_LOGO_URL) != 0) attributes.add("companyLogoUrl");
      if ((initBits & INIT_BIT_COMPANY_NAME) != 0) attributes.add("companyName");
      return "Cannot build LiteJobResponse, some of required attributes are not set " + attributes;
    }
  }
}
