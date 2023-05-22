// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform
{
    /// <summary>
    /// Resource for creating an Azure key vault in Harness.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Lbrlabs.PulumiPackage.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Harness.Platform.ConnectorAzureKeyVault("example", new()
    ///     {
    ///         AzureEnvironmentType = "AZURE",
    ///         ClientId = "client_id",
    ///         Description = "example",
    ///         Identifier = "identifier",
    ///         IsDefault = false,
    ///         SecretKey = "account.secret_key",
    ///         Subscription = "subscription",
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///         },
    ///         TenantId = "tenant_id",
    ///         VaultName = "vault_name",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level azure key vault connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/connectorAzureKeyVault:ConnectorAzureKeyVault example &lt;connector_id&gt;
    /// ```
    /// 
    ///  Import org level azure key vault connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/connectorAzureKeyVault:ConnectorAzureKeyVault example &lt;ord_id&gt;/&lt;connector_id&gt;
    /// ```
    /// 
    ///  Import project level azure key vault connector
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/connectorAzureKeyVault:ConnectorAzureKeyVault example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/connectorAzureKeyVault:ConnectorAzureKeyVault")]
    public partial class ConnectorAzureKeyVault : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
        /// </summary>
        [Output("azureEnvironmentType")]
        public Output<string> AzureEnvironmentType { get; private set; } = null!;

        /// <summary>
        /// Application ID of the Azure App.
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        [Output("delegateSelectors")]
        public Output<ImmutableArray<string>> DelegateSelectors { get; private set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Specifies whether or not is the default value.
        /// </summary>
        [Output("isDefault")]
        public Output<bool?> IsDefault { get; private set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The Harness text secret with the Azure authentication key as its value.
        /// </summary>
        [Output("secretKey")]
        public Output<string> SecretKey { get; private set; } = null!;

        /// <summary>
        /// Azure subscription ID.
        /// </summary>
        [Output("subscription")]
        public Output<string> Subscription { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The Azure Active Directory (Azure AD) directory ID where you created your application.
        /// </summary>
        [Output("tenantId")]
        public Output<string> TenantId { get; private set; } = null!;

        /// <summary>
        /// Name of the vault.
        /// </summary>
        [Output("vaultName")]
        public Output<string> VaultName { get; private set; } = null!;


        /// <summary>
        /// Create a ConnectorAzureKeyVault resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConnectorAzureKeyVault(string name, ConnectorAzureKeyVaultArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/connectorAzureKeyVault:ConnectorAzureKeyVault", name, args ?? new ConnectorAzureKeyVaultArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConnectorAzureKeyVault(string name, Input<string> id, ConnectorAzureKeyVaultState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/connectorAzureKeyVault:ConnectorAzureKeyVault", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ConnectorAzureKeyVault resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConnectorAzureKeyVault Get(string name, Input<string> id, ConnectorAzureKeyVaultState? state = null, CustomResourceOptions? options = null)
        {
            return new ConnectorAzureKeyVault(name, id, state, options);
        }
    }

    public sealed class ConnectorAzureKeyVaultArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
        /// </summary>
        [Input("azureEnvironmentType")]
        public Input<string>? AzureEnvironmentType { get; set; }

        /// <summary>
        /// Application ID of the Azure App.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Specifies whether or not is the default value.
        /// </summary>
        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The Harness text secret with the Azure authentication key as its value.
        /// </summary>
        [Input("secretKey", required: true)]
        public Input<string> SecretKey { get; set; } = null!;

        /// <summary>
        /// Azure subscription ID.
        /// </summary>
        [Input("subscription", required: true)]
        public Input<string> Subscription { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Azure Active Directory (Azure AD) directory ID where you created your application.
        /// </summary>
        [Input("tenantId", required: true)]
        public Input<string> TenantId { get; set; } = null!;

        /// <summary>
        /// Name of the vault.
        /// </summary>
        [Input("vaultName", required: true)]
        public Input<string> VaultName { get; set; } = null!;

        public ConnectorAzureKeyVaultArgs()
        {
        }
        public static new ConnectorAzureKeyVaultArgs Empty => new ConnectorAzureKeyVaultArgs();
    }

    public sealed class ConnectorAzureKeyVaultState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
        /// </summary>
        [Input("azureEnvironmentType")]
        public Input<string>? AzureEnvironmentType { get; set; }

        /// <summary>
        /// Application ID of the Azure App.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Tags to filter delegates for connection.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Specifies whether or not is the default value.
        /// </summary>
        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The Harness text secret with the Azure authentication key as its value.
        /// </summary>
        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        /// <summary>
        /// Azure subscription ID.
        /// </summary>
        [Input("subscription")]
        public Input<string>? Subscription { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Azure Active Directory (Azure AD) directory ID where you created your application.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        /// <summary>
        /// Name of the vault.
        /// </summary>
        [Input("vaultName")]
        public Input<string>? VaultName { get; set; }

        public ConnectorAzureKeyVaultState()
        {
        }
        public static new ConnectorAzureKeyVaultState Empty => new ConnectorAzureKeyVaultState();
    }
}
