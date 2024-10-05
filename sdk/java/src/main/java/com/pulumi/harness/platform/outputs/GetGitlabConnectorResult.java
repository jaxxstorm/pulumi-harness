// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetGitlabConnectorApiAuthentication;
import com.pulumi.harness.platform.outputs.GetGitlabConnectorCredential;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitlabConnectorResult {
    /**
     * @return Configuration for using the gitlab api. API Access is Computed for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     * 
     */
    private List<GetGitlabConnectorApiAuthentication> apiAuthentications;
    /**
     * @return Whether the connection we&#39;re making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
     * 
     */
    private String connectionType;
    /**
     * @return Credentials to use for the connection.
     * 
     */
    private List<GetGitlabConnectorCredential> credentials;
    /**
     * @return Tags to filter delegates for connection.
     * 
     */
    private List<String> delegateSelectors;
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource.
     * 
     */
    private String identifier;
    /**
     * @return Name of the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Tags to associate with the resource.
     * 
     */
    private List<String> tags;
    /**
     * @return URL of the gitlab repository or account.
     * 
     */
    private String url;
    /**
     * @return Repository to test the connection with. This is only used when `connection_type` is `Account`.
     * 
     */
    private String validationRepo;

    private GetGitlabConnectorResult() {}
    /**
     * @return Configuration for using the gitlab api. API Access is Computed for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     * 
     */
    public List<GetGitlabConnectorApiAuthentication> apiAuthentications() {
        return this.apiAuthentications;
    }
    /**
     * @return Whether the connection we&#39;re making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
     * 
     */
    public String connectionType() {
        return this.connectionType;
    }
    /**
     * @return Credentials to use for the connection.
     * 
     */
    public List<GetGitlabConnectorCredential> credentials() {
        return this.credentials;
    }
    /**
     * @return Tags to filter delegates for connection.
     * 
     */
    public List<String> delegateSelectors() {
        return this.delegateSelectors;
    }
    /**
     * @return Description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the resource.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Tags to associate with the resource.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return URL of the gitlab repository or account.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return Repository to test the connection with. This is only used when `connection_type` is `Account`.
     * 
     */
    public String validationRepo() {
        return this.validationRepo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitlabConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGitlabConnectorApiAuthentication> apiAuthentications;
        private String connectionType;
        private List<GetGitlabConnectorCredential> credentials;
        private List<String> delegateSelectors;
        private String description;
        private String id;
        private String identifier;
        private @Nullable String name;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private List<String> tags;
        private String url;
        private String validationRepo;
        public Builder() {}
        public Builder(GetGitlabConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiAuthentications = defaults.apiAuthentications;
    	      this.connectionType = defaults.connectionType;
    	      this.credentials = defaults.credentials;
    	      this.delegateSelectors = defaults.delegateSelectors;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.tags = defaults.tags;
    	      this.url = defaults.url;
    	      this.validationRepo = defaults.validationRepo;
        }

        @CustomType.Setter
        public Builder apiAuthentications(List<GetGitlabConnectorApiAuthentication> apiAuthentications) {
            if (apiAuthentications == null) {
              throw new MissingRequiredPropertyException("GetGitlabConnectorResult", "apiAuthentications");
            }
            this.apiAuthentications = apiAuthentications;
            return this;
        }
        public Builder apiAuthentications(GetGitlabConnectorApiAuthentication... apiAuthentications) {
            return apiAuthentications(List.of(apiAuthentications));
        }
        @CustomType.Setter
        public Builder connectionType(String connectionType) {
            if (connectionType == null) {
              throw new MissingRequiredPropertyException("GetGitlabConnectorResult", "connectionType");
            }
            this.connectionType = connectionType;
            return this;
        }
        @CustomType.Setter
        public Builder credentials(List<GetGitlabConnectorCredential> credentials) {
            if (credentials == null) {
              throw new MissingRequiredPropertyException("GetGitlabConnectorResult", "credentials");
            }
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(GetGitlabConnectorCredential... credentials) {
            return credentials(List.of(credentials));
        }
        @CustomType.Setter
        public Builder delegateSelectors(List<String> delegateSelectors) {
            if (delegateSelectors == null) {
              throw new MissingRequiredPropertyException("GetGitlabConnectorResult", "delegateSelectors");
            }
            this.delegateSelectors = delegateSelectors;
            return this;
        }
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetGitlabConnectorResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGitlabConnectorResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetGitlabConnectorResult", "identifier");
            }
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetGitlabConnectorResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetGitlabConnectorResult", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder validationRepo(String validationRepo) {
            if (validationRepo == null) {
              throw new MissingRequiredPropertyException("GetGitlabConnectorResult", "validationRepo");
            }
            this.validationRepo = validationRepo;
            return this;
        }
        public GetGitlabConnectorResult build() {
            final var _resultValue = new GetGitlabConnectorResult();
            _resultValue.apiAuthentications = apiAuthentications;
            _resultValue.connectionType = connectionType;
            _resultValue.credentials = credentials;
            _resultValue.delegateSelectors = delegateSelectors;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            _resultValue.tags = tags;
            _resultValue.url = url;
            _resultValue.validationRepo = validationRepo;
            return _resultValue;
        }
    }
}