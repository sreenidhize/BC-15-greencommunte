package com.greencommute.jobmanagementservice.dto.response;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.greencommute.jobmanagementservice.model.ExperienceLevel;
import com.greencommute.jobmanagementservice.model.JobType;
import com.greencommute.jobmanagementservice.model.Skills;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link JobResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableJobResponse.builder()}.
 */
@Generated(from = "JobResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableJobResponse extends JobResponse {
  private final UUID iD;
  private final String title;
  private final Boolean isActive;
  private final LocalDate datePosted;
  private final String description;
  private final ImmutableList<Skills> skills;
  private final ImmutableList<String> requirements;
  private final String address;
  private final Double[] location;
  private final String companyLogoUrl;
  private final String companyName;
  private final Boolean isGreenCommute;
  private final JobType jobType;
  private final ExperienceLevel experienceLevel;

  private ImmutableJobResponse(
      UUID iD,
      String title,
      Boolean isActive,
      LocalDate datePosted,
      String description,
      ImmutableList<Skills> skills,
      ImmutableList<String> requirements,
      String address,
      Double[] location,
      String companyLogoUrl,
      String companyName,
      Boolean isGreenCommute,
      JobType jobType,
      ExperienceLevel experienceLevel) {
    this.iD = iD;
    this.title = title;
    this.isActive = isActive;
    this.datePosted = datePosted;
    this.description = description;
    this.skills = skills;
    this.requirements = requirements;
    this.address = address;
    this.location = location;
    this.companyLogoUrl = companyLogoUrl;
    this.companyName = companyName;
    this.isGreenCommute = isGreenCommute;
    this.jobType = jobType;
    this.experienceLevel = experienceLevel;
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
   * @return The value of the {@code isActive} attribute
   */
  @Override
  public Boolean getIsActive() {
    return isActive;
  }

  /**
   * @return The value of the {@code datePosted} attribute
   */
  @Override
  public LocalDate getDatePosted() {
    return datePosted;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @Override
  public String getDescription() {
    return description;
  }

  /**
   * @return The value of the {@code skills} attribute
   */
  @Override
  public ImmutableList<Skills> getSkills() {
    return skills;
  }

  /**
   * @return The value of the {@code requirements} attribute
   */
  @Override
  public ImmutableList<String> getRequirements() {
    return requirements;
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @Override
  public String getAddress() {
    return address;
  }

  /**
   * @return A cloned {@code location} array
   */
  @Override
  public Double[] getLocation() {
    return location.clone();
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
   * @return The value of the {@code isGreenCommute} attribute
   */
  @Override
  public Boolean getIsGreenCommute() {
    return isGreenCommute;
  }

  /**
   * @return The value of the {@code jobType} attribute
   */
  @Override
  public JobType getJobType() {
    return jobType;
  }

  /**
   * @return The value of the {@code experienceLevel} attribute
   */
  @Override
  public ExperienceLevel getExperienceLevel() {
    return experienceLevel;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getID() iD} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for iD
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withID(UUID value) {
    if (this.iD == value) return this;
    UUID newValue = Objects.requireNonNull(value, "iD");
    return new ImmutableJobResponse(
        newValue,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getTitle() title} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for title
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withTitle(String value) {
    String newValue = Objects.requireNonNull(value, "title");
    if (this.title.equals(newValue)) return this;
    return new ImmutableJobResponse(
        this.iD,
        newValue,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getIsActive() isActive} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isActive
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withIsActive(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "isActive");
    if (this.isActive.equals(newValue)) return this;
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        newValue,
        this.datePosted,
        this.description,
        this.skills,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getDatePosted() datePosted} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for datePosted
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withDatePosted(LocalDate value) {
    if (this.datePosted == value) return this;
    LocalDate newValue = Objects.requireNonNull(value, "datePosted");
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        newValue,
        this.description,
        this.skills,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getDescription() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withDescription(String value) {
    String newValue = Objects.requireNonNull(value, "description");
    if (this.description.equals(newValue)) return this;
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        newValue,
        this.skills,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link JobResponse#getSkills() skills}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJobResponse withSkills(Skills... elements) {
    ImmutableList<Skills> newValue = ImmutableList.copyOf(elements);
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        newValue,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link JobResponse#getSkills() skills}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of skills elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJobResponse withSkills(Iterable<? extends Skills> elements) {
    if (this.skills == elements) return this;
    ImmutableList<Skills> newValue = ImmutableList.copyOf(elements);
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        newValue,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link JobResponse#getRequirements() requirements}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJobResponse withRequirements(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        newValue,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link JobResponse#getRequirements() requirements}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of requirements elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJobResponse withRequirements(Iterable<String> elements) {
    if (this.requirements == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        newValue,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getAddress() address} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for address
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withAddress(String value) {
    String newValue = Objects.requireNonNull(value, "address");
    if (this.address.equals(newValue)) return this;
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        this.requirements,
        newValue,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link JobResponse#getLocation() location}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableJobResponse withLocation(Double... elements) {
    Double[] newValue = elements.clone();
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        this.requirements,
        this.address,
        newValue,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getCompanyLogoUrl() companyLogoUrl} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for companyLogoUrl
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withCompanyLogoUrl(String value) {
    String newValue = Objects.requireNonNull(value, "companyLogoUrl");
    if (this.companyLogoUrl.equals(newValue)) return this;
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        this.requirements,
        this.address,
        this.location,
        newValue,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getCompanyName() companyName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for companyName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withCompanyName(String value) {
    String newValue = Objects.requireNonNull(value, "companyName");
    if (this.companyName.equals(newValue)) return this;
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        newValue,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getIsGreenCommute() isGreenCommute} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isGreenCommute
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withIsGreenCommute(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "isGreenCommute");
    if (this.isGreenCommute.equals(newValue)) return this;
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        newValue,
        this.jobType,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getJobType() jobType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for jobType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withJobType(JobType value) {
    if (this.jobType == value) return this;
    JobType newValue = Objects.requireNonNull(value, "jobType");
    if (this.jobType.equals(newValue)) return this;
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        newValue,
        this.experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JobResponse#getExperienceLevel() experienceLevel} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for experienceLevel
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJobResponse withExperienceLevel(ExperienceLevel value) {
    if (this.experienceLevel == value) return this;
    ExperienceLevel newValue = Objects.requireNonNull(value, "experienceLevel");
    if (this.experienceLevel.equals(newValue)) return this;
    return new ImmutableJobResponse(
        this.iD,
        this.title,
        this.isActive,
        this.datePosted,
        this.description,
        this.skills,
        this.requirements,
        this.address,
        this.location,
        this.companyLogoUrl,
        this.companyName,
        this.isGreenCommute,
        this.jobType,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJobResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableJobResponse
        && equalTo((ImmutableJobResponse) another);
  }

  private boolean equalTo(ImmutableJobResponse another) {
    return iD.equals(another.iD)
        && title.equals(another.title)
        && isActive.equals(another.isActive)
        && datePosted.equals(another.datePosted)
        && description.equals(another.description)
        && skills.equals(another.skills)
        && requirements.equals(another.requirements)
        && address.equals(another.address)
        && Arrays.equals(location, another.location)
        && companyLogoUrl.equals(another.companyLogoUrl)
        && companyName.equals(another.companyName)
        && isGreenCommute.equals(another.isGreenCommute)
        && jobType.equals(another.jobType)
        && experienceLevel.equals(another.experienceLevel);
  }

  /**
   * Computes a hash code from attributes: {@code iD}, {@code title}, {@code isActive}, {@code datePosted}, {@code description}, {@code skills}, {@code requirements}, {@code address}, {@code location}, {@code companyLogoUrl}, {@code companyName}, {@code isGreenCommute}, {@code jobType}, {@code experienceLevel}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + iD.hashCode();
    h += (h << 5) + title.hashCode();
    h += (h << 5) + isActive.hashCode();
    h += (h << 5) + datePosted.hashCode();
    h += (h << 5) + description.hashCode();
    h += (h << 5) + skills.hashCode();
    h += (h << 5) + requirements.hashCode();
    h += (h << 5) + address.hashCode();
    h += (h << 5) + Arrays.hashCode(location);
    h += (h << 5) + companyLogoUrl.hashCode();
    h += (h << 5) + companyName.hashCode();
    h += (h << 5) + isGreenCommute.hashCode();
    h += (h << 5) + jobType.hashCode();
    h += (h << 5) + experienceLevel.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code JobResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("JobResponse")
        .omitNullValues()
        .add("iD", iD)
        .add("title", title)
        .add("isActive", isActive)
        .add("datePosted", datePosted)
        .add("description", description)
        .add("skills", skills)
        .add("requirements", requirements)
        .add("address", address)
        .add("location", Arrays.toString(location))
        .add("companyLogoUrl", companyLogoUrl)
        .add("companyName", companyName)
        .add("isGreenCommute", isGreenCommute)
        .add("jobType", jobType)
        .add("experienceLevel", experienceLevel)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link JobResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable JobResponse instance
   */
  public static ImmutableJobResponse copyOf(JobResponse instance) {
    if (instance instanceof ImmutableJobResponse) {
      return (ImmutableJobResponse) instance;
    }
    return ImmutableJobResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableJobResponse ImmutableJobResponse}.
   * <pre>
   * ImmutableJobResponse.builder()
   *    .iD(UUID) // required {@link JobResponse#getID() iD}
   *    .title(String) // required {@link JobResponse#getTitle() title}
   *    .isActive(Boolean) // required {@link JobResponse#getIsActive() isActive}
   *    .datePosted(java.time.LocalDate) // required {@link JobResponse#getDatePosted() datePosted}
   *    .description(String) // required {@link JobResponse#getDescription() description}
   *    .addSkills|addAllSkills(com.greencommute.jobmanagementservice.model.Skills) // {@link JobResponse#getSkills() skills} elements
   *    .addRequirements|addAllRequirements(String) // {@link JobResponse#getRequirements() requirements} elements
   *    .address(String) // required {@link JobResponse#getAddress() address}
   *    .location(Double) // required {@link JobResponse#getLocation() location}
   *    .companyLogoUrl(String) // required {@link JobResponse#getCompanyLogoUrl() companyLogoUrl}
   *    .companyName(String) // required {@link JobResponse#getCompanyName() companyName}
   *    .isGreenCommute(Boolean) // required {@link JobResponse#getIsGreenCommute() isGreenCommute}
   *    .jobType(com.greencommute.jobmanagementservice.model.JobType) // required {@link JobResponse#getJobType() jobType}
   *    .experienceLevel(com.greencommute.jobmanagementservice.model.ExperienceLevel) // required {@link JobResponse#getExperienceLevel() experienceLevel}
   *    .build();
   * </pre>
   * @return A new ImmutableJobResponse builder
   */
  public static ImmutableJobResponse.Builder builder() {
    return new ImmutableJobResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableJobResponse ImmutableJobResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "JobResponse", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_I_D = 0x1L;
    private static final long INIT_BIT_TITLE = 0x2L;
    private static final long INIT_BIT_IS_ACTIVE = 0x4L;
    private static final long INIT_BIT_DATE_POSTED = 0x8L;
    private static final long INIT_BIT_DESCRIPTION = 0x10L;
    private static final long INIT_BIT_ADDRESS = 0x20L;
    private static final long INIT_BIT_LOCATION = 0x40L;
    private static final long INIT_BIT_COMPANY_LOGO_URL = 0x80L;
    private static final long INIT_BIT_COMPANY_NAME = 0x100L;
    private static final long INIT_BIT_IS_GREEN_COMMUTE = 0x200L;
    private static final long INIT_BIT_JOB_TYPE = 0x400L;
    private static final long INIT_BIT_EXPERIENCE_LEVEL = 0x800L;
    private long initBits = 0xfffL;

    private UUID iD;
    private String title;
    private Boolean isActive;
    private LocalDate datePosted;
    private String description;
    private ImmutableList.Builder<Skills> skills = ImmutableList.builder();
    private ImmutableList.Builder<String> requirements = ImmutableList.builder();
    private String address;
    private Double[] location;
    private String companyLogoUrl;
    private String companyName;
    private Boolean isGreenCommute;
    private JobType jobType;
    private ExperienceLevel experienceLevel;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code JobResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(JobResponse instance) {
      Objects.requireNonNull(instance, "instance");
      iD(instance.getID());
      title(instance.getTitle());
      isActive(instance.getIsActive());
      datePosted(instance.getDatePosted());
      description(instance.getDescription());
      addAllSkills(instance.getSkills());
      addAllRequirements(instance.getRequirements());
      address(instance.getAddress());
      location(instance.getLocation());
      companyLogoUrl(instance.getCompanyLogoUrl());
      companyName(instance.getCompanyName());
      isGreenCommute(instance.getIsGreenCommute());
      jobType(instance.getJobType());
      experienceLevel(instance.getExperienceLevel());
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getID() iD} attribute.
     * @param iD The value for iD 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder iD(UUID iD) {
      this.iD = Objects.requireNonNull(iD, "iD");
      initBits &= ~INIT_BIT_I_D;
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getTitle() title} attribute.
     * @param title The value for title 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder title(String title) {
      this.title = Objects.requireNonNull(title, "title");
      initBits &= ~INIT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getIsActive() isActive} attribute.
     * @param isActive The value for isActive 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder isActive(Boolean isActive) {
      this.isActive = Objects.requireNonNull(isActive, "isActive");
      initBits &= ~INIT_BIT_IS_ACTIVE;
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getDatePosted() datePosted} attribute.
     * @param datePosted The value for datePosted 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder datePosted(LocalDate datePosted) {
      this.datePosted = Objects.requireNonNull(datePosted, "datePosted");
      initBits &= ~INIT_BIT_DATE_POSTED;
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getDescription() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Adds one element to {@link JobResponse#getSkills() skills} list.
     * @param element A skills element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSkills(Skills element) {
      this.skills.add(element);
      return this;
    }

    /**
     * Adds elements to {@link JobResponse#getSkills() skills} list.
     * @param elements An array of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSkills(Skills... elements) {
      this.skills.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link JobResponse#getSkills() skills} list.
     * @param elements An iterable of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder skills(Iterable<? extends Skills> elements) {
      this.skills = ImmutableList.builder();
      return addAllSkills(elements);
    }

    /**
     * Adds elements to {@link JobResponse#getSkills() skills} list.
     * @param elements An iterable of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSkills(Iterable<? extends Skills> elements) {
      this.skills.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link JobResponse#getRequirements() requirements} list.
     * @param element A requirements element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRequirements(String element) {
      this.requirements.add(element);
      return this;
    }

    /**
     * Adds elements to {@link JobResponse#getRequirements() requirements} list.
     * @param elements An array of requirements elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRequirements(String... elements) {
      this.requirements.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link JobResponse#getRequirements() requirements} list.
     * @param elements An iterable of requirements elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder requirements(Iterable<String> elements) {
      this.requirements = ImmutableList.builder();
      return addAllRequirements(elements);
    }

    /**
     * Adds elements to {@link JobResponse#getRequirements() requirements} list.
     * @param elements An iterable of requirements elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRequirements(Iterable<String> elements) {
      this.requirements.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getAddress() address} attribute.
     * @param address The value for address 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder address(String address) {
      this.address = Objects.requireNonNull(address, "address");
      initBits &= ~INIT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getLocation() location} attribute.
     * @param location The elements for location
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder location(Double... location) {
      this.location = location.clone();
      initBits &= ~INIT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getCompanyLogoUrl() companyLogoUrl} attribute.
     * @param companyLogoUrl The value for companyLogoUrl 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder companyLogoUrl(String companyLogoUrl) {
      this.companyLogoUrl = Objects.requireNonNull(companyLogoUrl, "companyLogoUrl");
      initBits &= ~INIT_BIT_COMPANY_LOGO_URL;
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getCompanyName() companyName} attribute.
     * @param companyName The value for companyName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder companyName(String companyName) {
      this.companyName = Objects.requireNonNull(companyName, "companyName");
      initBits &= ~INIT_BIT_COMPANY_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getIsGreenCommute() isGreenCommute} attribute.
     * @param isGreenCommute The value for isGreenCommute 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder isGreenCommute(Boolean isGreenCommute) {
      this.isGreenCommute = Objects.requireNonNull(isGreenCommute, "isGreenCommute");
      initBits &= ~INIT_BIT_IS_GREEN_COMMUTE;
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getJobType() jobType} attribute.
     * @param jobType The value for jobType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder jobType(JobType jobType) {
      this.jobType = Objects.requireNonNull(jobType, "jobType");
      initBits &= ~INIT_BIT_JOB_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link JobResponse#getExperienceLevel() experienceLevel} attribute.
     * @param experienceLevel The value for experienceLevel 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder experienceLevel(ExperienceLevel experienceLevel) {
      this.experienceLevel = Objects.requireNonNull(experienceLevel, "experienceLevel");
      initBits &= ~INIT_BIT_EXPERIENCE_LEVEL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableJobResponse ImmutableJobResponse}.
     * @return An immutable instance of JobResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableJobResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableJobResponse(
          iD,
          title,
          isActive,
          datePosted,
          description,
          skills.build(),
          requirements.build(),
          address,
          location,
          companyLogoUrl,
          companyName,
          isGreenCommute,
          jobType,
          experienceLevel);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_I_D) != 0) attributes.add("iD");
      if ((initBits & INIT_BIT_TITLE) != 0) attributes.add("title");
      if ((initBits & INIT_BIT_IS_ACTIVE) != 0) attributes.add("isActive");
      if ((initBits & INIT_BIT_DATE_POSTED) != 0) attributes.add("datePosted");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_ADDRESS) != 0) attributes.add("address");
      if ((initBits & INIT_BIT_LOCATION) != 0) attributes.add("location");
      if ((initBits & INIT_BIT_COMPANY_LOGO_URL) != 0) attributes.add("companyLogoUrl");
      if ((initBits & INIT_BIT_COMPANY_NAME) != 0) attributes.add("companyName");
      if ((initBits & INIT_BIT_IS_GREEN_COMMUTE) != 0) attributes.add("isGreenCommute");
      if ((initBits & INIT_BIT_JOB_TYPE) != 0) attributes.add("jobType");
      if ((initBits & INIT_BIT_EXPERIENCE_LEVEL) != 0) attributes.add("experienceLevel");
      return "Cannot build JobResponse, some of required attributes are not set " + attributes;
    }
  }
}
