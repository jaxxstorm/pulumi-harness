// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Harness.Platform.ResourceGroup("test", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         Description = "test",
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///         },
    ///         AccountId = "account_id",
    ///         AllowedScopeLevels = new[]
    ///         {
    ///             "account",
    ///         },
    ///         IncludedScopes = new[]
    ///         {
    ///             new Harness.Platform.Inputs.ResourceGroupIncludedScopeArgs
    ///             {
    ///                 Filter = "EXCLUDING_CHILD_SCOPES",
    ///                 AccountId = "account_id",
    ///             },
    ///         },
    ///         ResourceFilters = new[]
    ///         {
    ///             new Harness.Platform.Inputs.ResourceGroupResourceFilterArgs
    ///             {
    ///                 IncludeAllResources = false,
    ///                 Resources = new[]
    ///                 {
    ///                     new Harness.Platform.Inputs.ResourceGroupResourceFilterResourceArgs
    ///                     {
    ///                         ResourceType = "CONNECTOR",
    ///                         AttributeFilters = new[]
    ///                         {
    ///                             new Harness.Platform.Inputs.ResourceGroupResourceFilterResourceAttributeFilterArgs
    ///                             {
    ///                                 AttributeName = "category",
    ///                                 AttributeValues = new[]
    ///                                 {
    ///                                     "CLOUD_COST",
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level resource group
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/resourceGroup:ResourceGroup example &lt;resource_group_id&gt;
    /// ```
    /// 
    /// Import org level resource group
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/resourceGroup:ResourceGroup example &lt;ord_id&gt;/&lt;resource_group_id&gt;
    /// ```
    /// 
    /// Import project level resource group
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/resourceGroup:ResourceGroup example &lt;org_id&gt;/&lt;project_id&gt;/&lt;resource_group_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/resourceGroup:ResourceGroup")]
    public partial class ResourceGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account Identifier of the account
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The scope levels at which this resource group can be used
        /// </summary>
        [Output("allowedScopeLevels")]
        public Output<ImmutableArray<string>> AllowedScopeLevels { get; private set; } = null!;

        /// <summary>
        /// Color of the environment.
        /// </summary>
        [Output("color")]
        public Output<string> Color { get; private set; } = null!;

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
        /// Included scopes. The default is selected based on the resource group scope if not specified. (Go to nested schema below.)
        /// </summary>
        [Output("includedScopes")]
        public Output<ImmutableArray<Outputs.ResourceGroupIncludedScope>> IncludedScopes { get; private set; } = null!;

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
        /// Contains resource filter for a resource group
        /// </summary>
        [Output("resourceFilters")]
        public Output<ImmutableArray<Outputs.ResourceGroupResourceFilter>> ResourceFilters { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceGroup(string name, ResourceGroupArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/resourceGroup:ResourceGroup", name, args ?? new ResourceGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourceGroup(string name, Input<string> id, ResourceGroupState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/resourceGroup:ResourceGroup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceGroup Get(string name, Input<string> id, ResourceGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourceGroup(name, id, state, options);
        }
    }

    public sealed class ResourceGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Identifier of the account
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("allowedScopeLevels")]
        private InputList<string>? _allowedScopeLevels;

        /// <summary>
        /// The scope levels at which this resource group can be used
        /// </summary>
        public InputList<string> AllowedScopeLevels
        {
            get => _allowedScopeLevels ?? (_allowedScopeLevels = new InputList<string>());
            set => _allowedScopeLevels = value;
        }

        /// <summary>
        /// Color of the environment.
        /// </summary>
        [Input("color")]
        public Input<string>? Color { get; set; }

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

        [Input("includedScopes")]
        private InputList<Inputs.ResourceGroupIncludedScopeArgs>? _includedScopes;

        /// <summary>
        /// Included scopes. The default is selected based on the resource group scope if not specified. (Go to nested schema below.)
        /// </summary>
        public InputList<Inputs.ResourceGroupIncludedScopeArgs> IncludedScopes
        {
            get => _includedScopes ?? (_includedScopes = new InputList<Inputs.ResourceGroupIncludedScopeArgs>());
            set => _includedScopes = value;
        }

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

        [Input("resourceFilters")]
        private InputList<Inputs.ResourceGroupResourceFilterArgs>? _resourceFilters;

        /// <summary>
        /// Contains resource filter for a resource group
        /// </summary>
        public InputList<Inputs.ResourceGroupResourceFilterArgs> ResourceFilters
        {
            get => _resourceFilters ?? (_resourceFilters = new InputList<Inputs.ResourceGroupResourceFilterArgs>());
            set => _resourceFilters = value;
        }

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

        public ResourceGroupArgs()
        {
        }
        public static new ResourceGroupArgs Empty => new ResourceGroupArgs();
    }

    public sealed class ResourceGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Identifier of the account
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("allowedScopeLevels")]
        private InputList<string>? _allowedScopeLevels;

        /// <summary>
        /// The scope levels at which this resource group can be used
        /// </summary>
        public InputList<string> AllowedScopeLevels
        {
            get => _allowedScopeLevels ?? (_allowedScopeLevels = new InputList<string>());
            set => _allowedScopeLevels = value;
        }

        /// <summary>
        /// Color of the environment.
        /// </summary>
        [Input("color")]
        public Input<string>? Color { get; set; }

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

        [Input("includedScopes")]
        private InputList<Inputs.ResourceGroupIncludedScopeGetArgs>? _includedScopes;

        /// <summary>
        /// Included scopes. The default is selected based on the resource group scope if not specified. (Go to nested schema below.)
        /// </summary>
        public InputList<Inputs.ResourceGroupIncludedScopeGetArgs> IncludedScopes
        {
            get => _includedScopes ?? (_includedScopes = new InputList<Inputs.ResourceGroupIncludedScopeGetArgs>());
            set => _includedScopes = value;
        }

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

        [Input("resourceFilters")]
        private InputList<Inputs.ResourceGroupResourceFilterGetArgs>? _resourceFilters;

        /// <summary>
        /// Contains resource filter for a resource group
        /// </summary>
        public InputList<Inputs.ResourceGroupResourceFilterGetArgs> ResourceFilters
        {
            get => _resourceFilters ?? (_resourceFilters = new InputList<Inputs.ResourceGroupResourceFilterGetArgs>());
            set => _resourceFilters = value;
        }

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

        public ResourceGroupState()
        {
        }
        public static new ResourceGroupState Empty => new ResourceGroupState();
    }
}
