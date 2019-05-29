
package org.aktis;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "organization_id",
    "organization_name",
    "role",
    "status",
    "person_id",
    "person_name",
    "email"
})
public class Attributes {

    @JsonProperty("organization_id")
    private Integer organizationId;
    @JsonProperty("organization_name")
    private String organizationName;
    @JsonProperty("role")
    private String role;
    @JsonProperty("status")
    private String status;
    @JsonProperty("person_id")
    private Integer personId;
    @JsonProperty("person_name")
    private String personName;
    @JsonProperty("email")
    private String email;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("organization_id")
    public Integer getOrganizationId() {
        return organizationId;
    }

    @JsonProperty("organization_id")
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Attributes withOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    @JsonProperty("organization_name")
    public String getOrganizationName() {
        return organizationName;
    }

    @JsonProperty("organization_name")
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Attributes withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public Attributes withRole(String role) {
        this.role = role;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Attributes withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("person_id")
    public Integer getPersonId() {
        return personId;
    }

    @JsonProperty("person_id")
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Attributes withPersonId(Integer personId) {
        this.personId = personId;
        return this;
    }

    @JsonProperty("person_name")
    public String getPersonName() {
        return personName;
    }

    @JsonProperty("person_name")
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Attributes withPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Attributes withEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Attributes withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(organizationId).append(organizationName).append(role).append(status).append(personId).append(personName).append(email).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attributes) == false) {
            return false;
        }
        Attributes rhs = ((Attributes) other);
        return new EqualsBuilder().append(organizationId, rhs.organizationId).append(organizationName, rhs.organizationName).append(role, rhs.role).append(status, rhs.status).append(personId, rhs.personId).append(personName, rhs.personName).append(email, rhs.email).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
