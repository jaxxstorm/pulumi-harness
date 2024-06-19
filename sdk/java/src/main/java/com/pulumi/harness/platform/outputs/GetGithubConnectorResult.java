// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetGithubConnectorApiAuthentication;
import com.pulumi.harness.platform.outputs.GetGithubConnectorCredential;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGithubConnectorResult {
    /**
     * @return Configuration for using the github api. API Access is Computed for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     * 
     */
    private List<GetGithubConnectorApiAuthentication> apiAuthentications;
    /**
     * @return Whether the connection we&#39;re making is to a github repository or a github account. Valid values are Account, Repo.
     * 
     */
    private String connectionType;
    /**
     * @return Credentials to use for the connection.
     * 
     */
    private List<GetGithubConnectorCredential> credentials;
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
    private Boolean executeOnDelegate;
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
     * @return URL of the github repository or account.
     * 
     */
    private String url;
    /**
     * @return Repository to test the connection with. This is only used when `connection_type` is `Account`.
     * 
     */
    private String validationRepo;

    private GetGithubConnectorResult() {}
    /**
     * @return Configuration for using the github api. API Access is Computed for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
     * 
     */
    public List<GetGithubConnectorApiAuthentication> apiAuthentications() {
        return this.apiAuthentications;
    }
    /**
     * @return Whether the connection we&#39;re making is to a github repository or a github account. Valid values are Account, Repo.
     * 
     */
    public String connectionType() {
        return this.connectionType;
    }
    /**
     * @return Credentials to use for the connection.
     * 
     */
    public List<GetGithubConnectorCredential> credentials() {
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
    public Boolean executeOnDelegate() {
        return this.executeOnDelegate;
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
     * @return URL of the github repository or account.
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

    public static Builder builder(GetGithubConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGithubConnectorApiAuthentication> apiAuthentications;
        private String connectionType;
        private List<GetGithubConnectorCredential> credentials;
        private List<String> delegateSelectors;
        private String description;
        private Boolean executeOnDelegate;
        private String id;
        private String identifier;
        private @Nullable String name;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private List<String> tags;
        private String url;
        private String validationRepo;
        public Builder() {}
        public Builder(GetGithubConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiAuthentications = defaults.apiAuthentications;
    	      this.connectionType = defaults.connectionType;
    	      this.credentials = defaults.credentials;
    	      this.delegateSelectors = defaults.delegateSelectors;
    	      this.description = defaults.description;
    	      this.executeOnDelegate = defaults.executeOnDelegate;
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
        public Builder apiAuthentications(List<GetGithubConnectorApiAuthentication> apiAuthentications) {
            if (apiAuthentications == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "apiAuthentications");
            }
            this.apiAuthentications = apiAuthentications;
            return this;
        }
        public Builder apiAuthentications(GetGithubConnectorApiAuthentication... apiAuthentications) {
            return apiAuthentications(List.of(apiAuthentications));
        }
        @CustomType.Setter
        public Builder connectionType(String connectionType) {
            if (connectionType == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "connectionType");
            }
            this.connectionType = connectionType;
            return this;
        }
        @CustomType.Setter
        public Builder credentials(List<GetGithubConnectorCredential> credentials) {
            if (credentials == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "credentials");
            }
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(GetGithubConnectorCredential... credentials) {
            return credentials(List.of(credentials));
        }
        @CustomType.Setter
        public Builder delegateSelectors(List<String> delegateSelectors) {
            if (delegateSelectors == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "delegateSelectors");
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
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder executeOnDelegate(Boolean executeOnDelegate) {
            if (executeOnDelegate == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "executeOnDelegate");
            }
            this.executeOnDelegate = executeOnDelegate;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            if (identifier == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "identifier");
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
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "tags");
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
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder validationRepo(String validationRepo) {
            if (validationRepo == null) {
              throw new MissingRequiredPropertyException("GetGithubConnectorResult", "validationRepo");
            }
            this.validationRepo = validationRepo;
            return this;
        }
        public GetGithubConnectorResult build() {
            final var _resultValue = new GetGithubConnectorResult();
            _resultValue.apiAuthentications = apiAuthentications;
            _resultValue.connectionType = connectionType;
            _resultValue.credentials = credentials;
            _resultValue.delegateSelectors = delegateSelectors;
            _resultValue.description = description;
            _resultValue.executeOnDelegate = executeOnDelegate;
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
