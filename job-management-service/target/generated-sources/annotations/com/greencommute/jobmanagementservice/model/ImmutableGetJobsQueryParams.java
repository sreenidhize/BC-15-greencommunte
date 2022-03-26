package com.greencommute.jobmanagementservice.model;

import com.google.common.base.MoreObjects;
import java.util.Objects;
import java.util.Optional;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AbstractGetJobsQueryParams}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGetJobsQueryParams.builder()}.
 */
@Generated(from = "AbstractGetJobsQueryParams", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableGetJobsQueryParams
    extends AbstractGetJobsQueryParams {
  private final Skills skills;
  private final Double lat;
  private final Double lon;
  private final Integer distance;
  private final Boolean isGreenCommute;
  private final JobType jobType;
  private final ExperienceLevel experienceLevel;

  private ImmutableGetJobsQueryParams(
      Skills skills,
      Double lat,
      Double lon,
      Integer distance,
      Boolean isGreenCommute,
      JobType jobType,
      ExperienceLevel experienceLevel) {
    this.skills = skills;
    this.lat = lat;
    this.lon = lon;
    this.distance = distance;
    this.isGreenCommute = isGreenCommute;
    this.jobType = jobType;
    this.experienceLevel = experienceLevel;
  }

  /**
   * @return The value of the {@code skills} attribute
   */
  @Override
  public Optional<Skills> getSkills() {
    return Optional.ofNullable(skills);
  }

  /**
   * @return The value of the {@code lat} attribute
   */
  @Override
  public Optional<Double> getLat() {
    return Optional.ofNullable(lat);
  }

  /**
   * @return The value of the {@code lon} attribute
   */
  @Override
  public Optional<Double> getLon() {
    return Optional.ofNullable(lon);
  }

  /**
   * @return The value of the {@code distance} attribute
   */
  @Override
  public Optional<Integer> getDistance() {
    return Optional.ofNullable(distance);
  }

  /**
   * @return The value of the {@code isGreenCommute} attribute
   */
  @Override
  public Optional<Boolean> getIsGreenCommute() {
    return Optional.ofNullable(isGreenCommute);
  }

  /**
   * @return The value of the {@code jobType} attribute
   */
  @Override
  public Optional<JobType> getJobType() {
    return Optional.ofNullable(jobType);
  }

  /**
   * @return The value of the {@code experienceLevel} attribute
   */
  @Override
  public Optional<ExperienceLevel> getExperienceLevel() {
    return Optional.ofNullable(experienceLevel);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AbstractGetJobsQueryParams#getSkills() skills} attribute.
   * @param value The value for skills
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withSkills(Skills value) {
    Skills newValue = Objects.requireNonNull(value, "skills");
    if (this.skills == newValue) return this;
    return validate(new ImmutableGetJobsQueryParams(
        newValue,
        this.lat,
        this.lon,
        this.distance,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AbstractGetJobsQueryParams#getSkills() skills} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for skills
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGetJobsQueryParams withSkills(Optional<? extends Skills> optional) {
    Skills value = optional.orElse(null);
    if (Objects.equals(this.skills, value)) return this;
    return validate(new ImmutableGetJobsQueryParams(
        value,
        this.lat,
        this.lon,
        this.distance,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AbstractGetJobsQueryParams#getLat() lat} attribute.
   * @param value The value for lat
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withLat(double value) {
    Double newValue = value;
    if (Objects.equals(this.lat, newValue)) return this;
    return validate(new ImmutableGetJobsQueryParams(
        this.skills,
        newValue,
        this.lon,
        this.distance,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AbstractGetJobsQueryParams#getLat() lat} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lat
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withLat(Optional<Double> optional) {
    Double value = optional.orElse(null);
    if (Objects.equals(this.lat, value)) return this;
    return validate(new ImmutableGetJobsQueryParams(
        this.skills,
        value,
        this.lon,
        this.distance,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AbstractGetJobsQueryParams#getLon() lon} attribute.
   * @param value The value for lon
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withLon(double value) {
    Double newValue = value;
    if (Objects.equals(this.lon, newValue)) return this;
    return validate(new ImmutableGetJobsQueryParams(
        this.skills,
        this.lat,
        newValue,
        this.distance,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AbstractGetJobsQueryParams#getLon() lon} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lon
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withLon(Optional<Double> optional) {
    Double value = optional.orElse(null);
    if (Objects.equals(this.lon, value)) return this;
    return validate(new ImmutableGetJobsQueryParams(
        this.skills,
        this.lat,
        value,
        this.distance,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AbstractGetJobsQueryParams#getDistance() distance} attribute.
   * @param value The value for distance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withDistance(int value) {
    Integer newValue = value;
    if (Objects.equals(this.distance, newValue)) return this;
    return validate(new ImmutableGetJobsQueryParams(
        this.skills,
        this.lat,
        this.lon,
        newValue,
        this.isGreenCommute,
        this.jobType,
        this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AbstractGetJobsQueryParams#getDistance() distance} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for distance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withDistance(Optional<Integer> optional) {
    Integer value = optional.orElse(null);
    if (Objects.equals(this.distance, value)) return this;
    return validate(new ImmutableGetJobsQueryParams(this.skills, this.lat, this.lon, value, this.isGreenCommute, this.jobType, this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AbstractGetJobsQueryParams#getIsGreenCommute() isGreenCommute} attribute.
   * @param value The value for isGreenCommute
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withIsGreenCommute(boolean value) {
    Boolean newValue = value;
    if (Objects.equals(this.isGreenCommute, newValue)) return this;
    return validate(new ImmutableGetJobsQueryParams(this.skills, this.lat, this.lon, this.distance, newValue, this.jobType, this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AbstractGetJobsQueryParams#getIsGreenCommute() isGreenCommute} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isGreenCommute
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withIsGreenCommute(Optional<Boolean> optional) {
    Boolean value = optional.orElse(null);
    if (Objects.equals(this.isGreenCommute, value)) return this;
    return validate(new ImmutableGetJobsQueryParams(this.skills, this.lat, this.lon, this.distance, value, this.jobType, this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AbstractGetJobsQueryParams#getJobType() jobType} attribute.
   * @param value The value for jobType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withJobType(JobType value) {
    JobType newValue = Objects.requireNonNull(value, "jobType");
    if (this.jobType == newValue) return this;
    return validate(new ImmutableGetJobsQueryParams(
        this.skills,
        this.lat,
        this.lon,
        this.distance,
        this.isGreenCommute,
        newValue,
        this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AbstractGetJobsQueryParams#getJobType() jobType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jobType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGetJobsQueryParams withJobType(Optional<? extends JobType> optional) {
    JobType value = optional.orElse(null);
    if (Objects.equals(this.jobType, value)) return this;
    return validate(new ImmutableGetJobsQueryParams(
        this.skills,
        this.lat,
        this.lon,
        this.distance,
        this.isGreenCommute,
        value,
        this.experienceLevel));
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AbstractGetJobsQueryParams#getExperienceLevel() experienceLevel} attribute.
   * @param value The value for experienceLevel
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetJobsQueryParams withExperienceLevel(ExperienceLevel value) {
    ExperienceLevel newValue = Objects.requireNonNull(value, "experienceLevel");
    if (this.experienceLevel == newValue) return this;
    return validate(new ImmutableGetJobsQueryParams(this.skills, this.lat, this.lon, this.distance, this.isGreenCommute, this.jobType, newValue));
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AbstractGetJobsQueryParams#getExperienceLevel() experienceLevel} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experienceLevel
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGetJobsQueryParams withExperienceLevel(Optional<? extends ExperienceLevel> optional) {
    ExperienceLevel value = optional.orElse(null);
    if (Objects.equals(this.experienceLevel, value)) return this;
    return validate(new ImmutableGetJobsQueryParams(this.skills, this.lat, this.lon, this.distance, this.isGreenCommute, this.jobType, value));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGetJobsQueryParams} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGetJobsQueryParams
        && equalTo((ImmutableGetJobsQueryParams) another);
  }

  private boolean equalTo(ImmutableGetJobsQueryParams another) {
    return Objects.equals(skills, another.skills)
        && Objects.equals(lat, another.lat)
        && Objects.equals(lon, another.lon)
        && Objects.equals(distance, another.distance)
        && Objects.equals(isGreenCommute, another.isGreenCommute)
        && Objects.equals(jobType, another.jobType)
        && Objects.equals(experienceLevel, another.experienceLevel);
  }

  /**
   * Computes a hash code from attributes: {@code skills}, {@code lat}, {@code lon}, {@code distance}, {@code isGreenCommute}, {@code jobType}, {@code experienceLevel}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(skills);
    h += (h << 5) + Objects.hashCode(lat);
    h += (h << 5) + Objects.hashCode(lon);
    h += (h << 5) + Objects.hashCode(distance);
    h += (h << 5) + Objects.hashCode(isGreenCommute);
    h += (h << 5) + Objects.hashCode(jobType);
    h += (h << 5) + Objects.hashCode(experienceLevel);
    return h;
  }

  /**
   * Prints the immutable value {@code GetJobsQueryParams} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GetJobsQueryParams")
        .omitNullValues()
        .add("skills", skills)
        .add("lat", lat)
        .add("lon", lon)
        .add("distance", distance)
        .add("isGreenCommute", isGreenCommute)
        .add("jobType", jobType)
        .add("experienceLevel", experienceLevel)
        .toString();
  }

  private static ImmutableGetJobsQueryParams validate(ImmutableGetJobsQueryParams instance) {
    instance.check();
    return instance;
  }

  /**
   * Creates an immutable copy of a {@link AbstractGetJobsQueryParams} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GetJobsQueryParams instance
   */
  public static ImmutableGetJobsQueryParams copyOf(AbstractGetJobsQueryParams instance) {
    if (instance instanceof ImmutableGetJobsQueryParams) {
      return (ImmutableGetJobsQueryParams) instance;
    }
    return ImmutableGetJobsQueryParams.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGetJobsQueryParams ImmutableGetJobsQueryParams}.
   * <pre>
   * ImmutableGetJobsQueryParams.builder()
   *    .skills(com.greencommute.jobmanagementservice.model.Skills) // optional {@link AbstractGetJobsQueryParams#getSkills() skills}
   *    .lat(Double) // optional {@link AbstractGetJobsQueryParams#getLat() lat}
   *    .lon(Double) // optional {@link AbstractGetJobsQueryParams#getLon() lon}
   *    .distance(Integer) // optional {@link AbstractGetJobsQueryParams#getDistance() distance}
   *    .isGreenCommute(Boolean) // optional {@link AbstractGetJobsQueryParams#getIsGreenCommute() isGreenCommute}
   *    .jobType(com.greencommute.jobmanagementservice.model.JobType) // optional {@link AbstractGetJobsQueryParams#getJobType() jobType}
   *    .experienceLevel(com.greencommute.jobmanagementservice.model.ExperienceLevel) // optional {@link AbstractGetJobsQueryParams#getExperienceLevel() experienceLevel}
   *    .build();
   * </pre>
   * @return A new ImmutableGetJobsQueryParams builder
   */
  public static ImmutableGetJobsQueryParams.Builder builder() {
    return new ImmutableGetJobsQueryParams.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGetJobsQueryParams ImmutableGetJobsQueryParams}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AbstractGetJobsQueryParams", generator = "Immutables")
  public static final class Builder {
    private Skills skills;
    private Double lat;
    private Double lon;
    private Integer distance;
    private Boolean isGreenCommute;
    private JobType jobType;
    private ExperienceLevel experienceLevel;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractGetJobsQueryParams} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AbstractGetJobsQueryParams instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<Skills> skillsOptional = instance.getSkills();
      if (skillsOptional.isPresent()) {
        skills(skillsOptional);
      }
      Optional<Double> latOptional = instance.getLat();
      if (latOptional.isPresent()) {
        lat(latOptional);
      }
      Optional<Double> lonOptional = instance.getLon();
      if (lonOptional.isPresent()) {
        lon(lonOptional);
      }
      Optional<Integer> distanceOptional = instance.getDistance();
      if (distanceOptional.isPresent()) {
        distance(distanceOptional);
      }
      Optional<Boolean> isGreenCommuteOptional = instance.getIsGreenCommute();
      if (isGreenCommuteOptional.isPresent()) {
        isGreenCommute(isGreenCommuteOptional);
      }
      Optional<JobType> jobTypeOptional = instance.getJobType();
      if (jobTypeOptional.isPresent()) {
        jobType(jobTypeOptional);
      }
      Optional<ExperienceLevel> experienceLevelOptional = instance.getExperienceLevel();
      if (experienceLevelOptional.isPresent()) {
        experienceLevel(experienceLevelOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getSkills() skills} to skills.
     * @param skills The value for skills
     * @return {@code this} builder for chained invocation
     */
    public final Builder skills(Skills skills) {
      this.skills = Objects.requireNonNull(skills, "skills");
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getSkills() skills} to skills.
     * @param skills The value for skills
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder skills(Optional<? extends Skills> skills) {
      this.skills = skills.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getLat() lat} to lat.
     * @param lat The value for lat
     * @return {@code this} builder for chained invocation
     */
    public final Builder lat(double lat) {
      this.lat = lat;
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getLat() lat} to lat.
     * @param lat The value for lat
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lat(Optional<Double> lat) {
      this.lat = lat.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getLon() lon} to lon.
     * @param lon The value for lon
     * @return {@code this} builder for chained invocation
     */
    public final Builder lon(double lon) {
      this.lon = lon;
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getLon() lon} to lon.
     * @param lon The value for lon
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lon(Optional<Double> lon) {
      this.lon = lon.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getDistance() distance} to distance.
     * @param distance The value for distance
     * @return {@code this} builder for chained invocation
     */
    public final Builder distance(int distance) {
      this.distance = distance;
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getDistance() distance} to distance.
     * @param distance The value for distance
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder distance(Optional<Integer> distance) {
      this.distance = distance.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getIsGreenCommute() isGreenCommute} to isGreenCommute.
     * @param isGreenCommute The value for isGreenCommute
     * @return {@code this} builder for chained invocation
     */
    public final Builder isGreenCommute(boolean isGreenCommute) {
      this.isGreenCommute = isGreenCommute;
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getIsGreenCommute() isGreenCommute} to isGreenCommute.
     * @param isGreenCommute The value for isGreenCommute
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder isGreenCommute(Optional<Boolean> isGreenCommute) {
      this.isGreenCommute = isGreenCommute.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getJobType() jobType} to jobType.
     * @param jobType The value for jobType
     * @return {@code this} builder for chained invocation
     */
    public final Builder jobType(JobType jobType) {
      this.jobType = Objects.requireNonNull(jobType, "jobType");
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getJobType() jobType} to jobType.
     * @param jobType The value for jobType
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder jobType(Optional<? extends JobType> jobType) {
      this.jobType = jobType.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getExperienceLevel() experienceLevel} to experienceLevel.
     * @param experienceLevel The value for experienceLevel
     * @return {@code this} builder for chained invocation
     */
    public final Builder experienceLevel(ExperienceLevel experienceLevel) {
      this.experienceLevel = Objects.requireNonNull(experienceLevel, "experienceLevel");
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractGetJobsQueryParams#getExperienceLevel() experienceLevel} to experienceLevel.
     * @param experienceLevel The value for experienceLevel
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder experienceLevel(Optional<? extends ExperienceLevel> experienceLevel) {
      this.experienceLevel = experienceLevel.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableGetJobsQueryParams ImmutableGetJobsQueryParams}.
     * @return An immutable instance of GetJobsQueryParams
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGetJobsQueryParams build() {
      return ImmutableGetJobsQueryParams.validate(new ImmutableGetJobsQueryParams(skills, lat, lon, distance, isGreenCommute, jobType, experienceLevel));
    }
  }
}
