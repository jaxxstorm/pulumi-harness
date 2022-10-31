// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVaultConnectorResult {
    /**
     * @return Access type.
     * 
     */
    private String accessType;
    /**
     * @return ID of App Role.
     * 
     */
    private String appRoleId;
    /**
     * @return The authentication token for Vault.
     * 
     */
    private String authToken;
    /**
     * @return The AWS region where AWS IAM auth will happen.
     * 
     */
    private String awsRegion;
    /**
     * @return The location of the Vault directory where Secret will be stored.
     * 
     */
    private String basePath;
    /**
     * @return Is default or not.
     * 
     */
    private Boolean default_;
    /**
     * @return List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
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
    private @Nullable String identifier;
    /**
     * @return Is default or not.
     * 
     */
    private Boolean isDefault;
    /**
     * @return Read only or not.
     * 
     */
    private Boolean isReadOnly;
    /**
     * @return The path where kubernetes auth is enabled in Vault.
     * 
     */
    private String k8sAuthEndpoint;
    /**
     * @return Name of the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Vault namespace where Secret will be created.
     * 
     */
    private String namespace;
    /**
     * @return Unique identifier of the Organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Unique identifier of the Project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Read only.
     * 
     */
    private Boolean readOnly;
    /**
     * @return Boolean value to indicate if appRole token renewal is enabled or not.
     * 
     */
    private Boolean renewAppRoleToken;
    /**
     * @return The time interval for token renewal.
     * 
     */
    private Integer renewalIntervalMinutes;
    /**
     * @return Manually entered Secret Engine.
     * 
     */
    private Boolean secretEngineManuallyConfigured;
    /**
     * @return Name of the Secret Engine.
     * 
     */
    private String secretEngineName;
    /**
     * @return Version of Secret Engine.
     * 
     */
    private Integer secretEngineVersion;
    /**
     * @return ID of the Secret.
     * 
     */
    private String secretId;
    /**
     * @return The SA token path where the token is mounted in the K8s Pod.
     * 
     */
    private String serviceAccountTokenPath;
    /**
     * @return The location at which auth token is to be read from.
     * 
     */
    private String sinkPath;
    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    private List<String> tags;
    /**
     * @return Boolean value to indicate if AWS IAM is used for authentication.
     * 
     */
    private Boolean useAwsIam;
    /**
     * @return Boolean value to indicate if K8s Auth is used for authentication.
     * 
     */
    private Boolean useK8sAuth;
    /**
     * @return Boolean value to indicate if Vault Agent is used for authentication.
     * 
     */
    private Boolean useVaultAgent;
    /**
     * @return The Vault role defined to bind to AWS IAM account/role being accessed.
     * 
     */
    private String vaultAwsIamRole;
    /**
     * @return The role where K8s auth will happen.
     * 
     */
    private String vaultK8sAuthRole;
    /**
     * @return URL of the HashiCorp Vault.
     * 
     */
    private String vaultUrl;
    /**
     * @return The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
     * 
     */
    private String xvaultAwsIamServerId;

    private GetVaultConnectorResult() {}
    /**
     * @return Access type.
     * 
     */
    public String accessType() {
        return this.accessType;
    }
    /**
     * @return ID of App Role.
     * 
     */
    public String appRoleId() {
        return this.appRoleId;
    }
    /**
     * @return The authentication token for Vault.
     * 
     */
    public String authToken() {
        return this.authToken;
    }
    /**
     * @return The AWS region where AWS IAM auth will happen.
     * 
     */
    public String awsRegion() {
        return this.awsRegion;
    }
    /**
     * @return The location of the Vault directory where Secret will be stored.
     * 
     */
    public String basePath() {
        return this.basePath;
    }
    /**
     * @return Is default or not.
     * 
     */
    public Boolean default_() {
        return this.default_;
    }
    /**
     * @return List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
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
    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }
    /**
     * @return Is default or not.
     * 
     */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * @return Read only or not.
     * 
     */
    public Boolean isReadOnly() {
        return this.isReadOnly;
    }
    /**
     * @return The path where kubernetes auth is enabled in Vault.
     * 
     */
    public String k8sAuthEndpoint() {
        return this.k8sAuthEndpoint;
    }
    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Vault namespace where Secret will be created.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return Unique identifier of the Organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Unique identifier of the Project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Read only.
     * 
     */
    public Boolean readOnly() {
        return this.readOnly;
    }
    /**
     * @return Boolean value to indicate if appRole token renewal is enabled or not.
     * 
     */
    public Boolean renewAppRoleToken() {
        return this.renewAppRoleToken;
    }
    /**
     * @return The time interval for token renewal.
     * 
     */
    public Integer renewalIntervalMinutes() {
        return this.renewalIntervalMinutes;
    }
    /**
     * @return Manually entered Secret Engine.
     * 
     */
    public Boolean secretEngineManuallyConfigured() {
        return this.secretEngineManuallyConfigured;
    }
    /**
     * @return Name of the Secret Engine.
     * 
     */
    public String secretEngineName() {
        return this.secretEngineName;
    }
    /**
     * @return Version of Secret Engine.
     * 
     */
    public Integer secretEngineVersion() {
        return this.secretEngineVersion;
    }
    /**
     * @return ID of the Secret.
     * 
     */
    public String secretId() {
        return this.secretId;
    }
    /**
     * @return The SA token path where the token is mounted in the K8s Pod.
     * 
     */
    public String serviceAccountTokenPath() {
        return this.serviceAccountTokenPath;
    }
    /**
     * @return The location at which auth token is to be read from.
     * 
     */
    public String sinkPath() {
        return this.sinkPath;
    }
    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Boolean value to indicate if AWS IAM is used for authentication.
     * 
     */
    public Boolean useAwsIam() {
        return this.useAwsIam;
    }
    /**
     * @return Boolean value to indicate if K8s Auth is used for authentication.
     * 
     */
    public Boolean useK8sAuth() {
        return this.useK8sAuth;
    }
    /**
     * @return Boolean value to indicate if Vault Agent is used for authentication.
     * 
     */
    public Boolean useVaultAgent() {
        return this.useVaultAgent;
    }
    /**
     * @return The Vault role defined to bind to AWS IAM account/role being accessed.
     * 
     */
    public String vaultAwsIamRole() {
        return this.vaultAwsIamRole;
    }
    /**
     * @return The role where K8s auth will happen.
     * 
     */
    public String vaultK8sAuthRole() {
        return this.vaultK8sAuthRole;
    }
    /**
     * @return URL of the HashiCorp Vault.
     * 
     */
    public String vaultUrl() {
        return this.vaultUrl;
    }
    /**
     * @return The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
     * 
     */
    public String xvaultAwsIamServerId() {
        return this.xvaultAwsIamServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVaultConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessType;
        private String appRoleId;
        private String authToken;
        private String awsRegion;
        private String basePath;
        private Boolean default_;
        private List<String> delegateSelectors;
        private String description;
        private String id;
        private @Nullable String identifier;
        private Boolean isDefault;
        private Boolean isReadOnly;
        private String k8sAuthEndpoint;
        private @Nullable String name;
        private String namespace;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private Boolean readOnly;
        private Boolean renewAppRoleToken;
        private Integer renewalIntervalMinutes;
        private Boolean secretEngineManuallyConfigured;
        private String secretEngineName;
        private Integer secretEngineVersion;
        private String secretId;
        private String serviceAccountTokenPath;
        private String sinkPath;
        private List<String> tags;
        private Boolean useAwsIam;
        private Boolean useK8sAuth;
        private Boolean useVaultAgent;
        private String vaultAwsIamRole;
        private String vaultK8sAuthRole;
        private String vaultUrl;
        private String xvaultAwsIamServerId;
        public Builder() {}
        public Builder(GetVaultConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.appRoleId = defaults.appRoleId;
    	      this.authToken = defaults.authToken;
    	      this.awsRegion = defaults.awsRegion;
    	      this.basePath = defaults.basePath;
    	      this.default_ = defaults.default_;
    	      this.delegateSelectors = defaults.delegateSelectors;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.isDefault = defaults.isDefault;
    	      this.isReadOnly = defaults.isReadOnly;
    	      this.k8sAuthEndpoint = defaults.k8sAuthEndpoint;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.readOnly = defaults.readOnly;
    	      this.renewAppRoleToken = defaults.renewAppRoleToken;
    	      this.renewalIntervalMinutes = defaults.renewalIntervalMinutes;
    	      this.secretEngineManuallyConfigured = defaults.secretEngineManuallyConfigured;
    	      this.secretEngineName = defaults.secretEngineName;
    	      this.secretEngineVersion = defaults.secretEngineVersion;
    	      this.secretId = defaults.secretId;
    	      this.serviceAccountTokenPath = defaults.serviceAccountTokenPath;
    	      this.sinkPath = defaults.sinkPath;
    	      this.tags = defaults.tags;
    	      this.useAwsIam = defaults.useAwsIam;
    	      this.useK8sAuth = defaults.useK8sAuth;
    	      this.useVaultAgent = defaults.useVaultAgent;
    	      this.vaultAwsIamRole = defaults.vaultAwsIamRole;
    	      this.vaultK8sAuthRole = defaults.vaultK8sAuthRole;
    	      this.vaultUrl = defaults.vaultUrl;
    	      this.xvaultAwsIamServerId = defaults.xvaultAwsIamServerId;
        }

        @CustomType.Setter
        public Builder accessType(String accessType) {
            this.accessType = Objects.requireNonNull(accessType);
            return this;
        }
        @CustomType.Setter
        public Builder appRoleId(String appRoleId) {
            this.appRoleId = Objects.requireNonNull(appRoleId);
            return this;
        }
        @CustomType.Setter
        public Builder authToken(String authToken) {
            this.authToken = Objects.requireNonNull(authToken);
            return this;
        }
        @CustomType.Setter
        public Builder awsRegion(String awsRegion) {
            this.awsRegion = Objects.requireNonNull(awsRegion);
            return this;
        }
        @CustomType.Setter
        public Builder basePath(String basePath) {
            this.basePath = Objects.requireNonNull(basePath);
            return this;
        }
        @CustomType.Setter("default")
        public Builder default_(Boolean default_) {
            this.default_ = Objects.requireNonNull(default_);
            return this;
        }
        @CustomType.Setter
        public Builder delegateSelectors(List<String> delegateSelectors) {
            this.delegateSelectors = Objects.requireNonNull(delegateSelectors);
            return this;
        }
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identifier(@Nullable String identifier) {
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }
        @CustomType.Setter
        public Builder isReadOnly(Boolean isReadOnly) {
            this.isReadOnly = Objects.requireNonNull(isReadOnly);
            return this;
        }
        @CustomType.Setter
        public Builder k8sAuthEndpoint(String k8sAuthEndpoint) {
            this.k8sAuthEndpoint = Objects.requireNonNull(k8sAuthEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
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
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }
        @CustomType.Setter
        public Builder renewAppRoleToken(Boolean renewAppRoleToken) {
            this.renewAppRoleToken = Objects.requireNonNull(renewAppRoleToken);
            return this;
        }
        @CustomType.Setter
        public Builder renewalIntervalMinutes(Integer renewalIntervalMinutes) {
            this.renewalIntervalMinutes = Objects.requireNonNull(renewalIntervalMinutes);
            return this;
        }
        @CustomType.Setter
        public Builder secretEngineManuallyConfigured(Boolean secretEngineManuallyConfigured) {
            this.secretEngineManuallyConfigured = Objects.requireNonNull(secretEngineManuallyConfigured);
            return this;
        }
        @CustomType.Setter
        public Builder secretEngineName(String secretEngineName) {
            this.secretEngineName = Objects.requireNonNull(secretEngineName);
            return this;
        }
        @CustomType.Setter
        public Builder secretEngineVersion(Integer secretEngineVersion) {
            this.secretEngineVersion = Objects.requireNonNull(secretEngineVersion);
            return this;
        }
        @CustomType.Setter
        public Builder secretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountTokenPath(String serviceAccountTokenPath) {
            this.serviceAccountTokenPath = Objects.requireNonNull(serviceAccountTokenPath);
            return this;
        }
        @CustomType.Setter
        public Builder sinkPath(String sinkPath) {
            this.sinkPath = Objects.requireNonNull(sinkPath);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder useAwsIam(Boolean useAwsIam) {
            this.useAwsIam = Objects.requireNonNull(useAwsIam);
            return this;
        }
        @CustomType.Setter
        public Builder useK8sAuth(Boolean useK8sAuth) {
            this.useK8sAuth = Objects.requireNonNull(useK8sAuth);
            return this;
        }
        @CustomType.Setter
        public Builder useVaultAgent(Boolean useVaultAgent) {
            this.useVaultAgent = Objects.requireNonNull(useVaultAgent);
            return this;
        }
        @CustomType.Setter
        public Builder vaultAwsIamRole(String vaultAwsIamRole) {
            this.vaultAwsIamRole = Objects.requireNonNull(vaultAwsIamRole);
            return this;
        }
        @CustomType.Setter
        public Builder vaultK8sAuthRole(String vaultK8sAuthRole) {
            this.vaultK8sAuthRole = Objects.requireNonNull(vaultK8sAuthRole);
            return this;
        }
        @CustomType.Setter
        public Builder vaultUrl(String vaultUrl) {
            this.vaultUrl = Objects.requireNonNull(vaultUrl);
            return this;
        }
        @CustomType.Setter
        public Builder xvaultAwsIamServerId(String xvaultAwsIamServerId) {
            this.xvaultAwsIamServerId = Objects.requireNonNull(xvaultAwsIamServerId);
            return this;
        }
        public GetVaultConnectorResult build() {
            final var o = new GetVaultConnectorResult();
            o.accessType = accessType;
            o.appRoleId = appRoleId;
            o.authToken = authToken;
            o.awsRegion = awsRegion;
            o.basePath = basePath;
            o.default_ = default_;
            o.delegateSelectors = delegateSelectors;
            o.description = description;
            o.id = id;
            o.identifier = identifier;
            o.isDefault = isDefault;
            o.isReadOnly = isReadOnly;
            o.k8sAuthEndpoint = k8sAuthEndpoint;
            o.name = name;
            o.namespace = namespace;
            o.orgId = orgId;
            o.projectId = projectId;
            o.readOnly = readOnly;
            o.renewAppRoleToken = renewAppRoleToken;
            o.renewalIntervalMinutes = renewalIntervalMinutes;
            o.secretEngineManuallyConfigured = secretEngineManuallyConfigured;
            o.secretEngineName = secretEngineName;
            o.secretEngineVersion = secretEngineVersion;
            o.secretId = secretId;
            o.serviceAccountTokenPath = serviceAccountTokenPath;
            o.sinkPath = sinkPath;
            o.tags = tags;
            o.useAwsIam = useAwsIam;
            o.useK8sAuth = useK8sAuth;
            o.useVaultAgent = useVaultAgent;
            o.vaultAwsIamRole = vaultAwsIamRole;
            o.vaultK8sAuthRole = vaultK8sAuthRole;
            o.vaultUrl = vaultUrl;
            o.xvaultAwsIamServerId = xvaultAwsIamServerId;
            return o;
        }
    }
}