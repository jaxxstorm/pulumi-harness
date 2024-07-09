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
    /// Resource for creating a Harness service override V2.
    /// 
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
    ///     var test = new Harness.Platform.ServiceOverridesV2("test", new()
    ///     {
    ///         OrgId = "orgIdentifier",
    ///         ProjectId = "projectIdentifier",
    ///         EnvId = "environmentIdentifier",
    ///         ServiceId = "serviceIdentifier",
    ///         InfraId = "infraIdentifier",
    ///         Type = "INFRA_SERVICE_OVERRIDE",
    ///         Yaml = @"variables:
    ///   - name: var1
    ///     type: String
    ///     value: val1
    /// configFiles:
    ///   - configFile:
    ///       identifier: sampleConfigFile
    ///       spec:
    ///         store:
    ///           type: Harness
    ///           spec:
    ///             files:
    ///               - account:/configFile1
    /// manifests:
    ///   - manifest:
    ///       identifier: sampleManifestFile
    ///       type: Values
    ///       spec:
    ///         store:
    ///           type: Harness
    ///           spec:
    ///             files:
    ///               - account:/manifestFile1
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Creating Remote Service Override
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Harness.Platform.ServiceOverridesV2("test", new()
    ///     {
    ///         OrgId = "orgIdentifier",
    ///         ProjectId = "projectIdentifier",
    ///         EnvId = "environmentIdentifier",
    ///         ServiceId = "serviceIdentifier",
    ///         InfraId = "infraIdentifier",
    ///         Type = "INFRA_SERVICE_OVERRIDE",
    ///         GitDetails = new Harness.Platform.Inputs.ServiceOverridesV2GitDetailsArgs
    ///         {
    ///             StoreType = "REMOTE",
    ///             ConnectorRef = "connector_ref",
    ///             RepoName = "repo_name",
    ///             FilePath = "file_path",
    ///             Branch = "branch",
    ///         },
    ///         Yaml = @"variables:
    ///   - name: v1
    ///     type: String
    ///     value: val1
    /// manifests:
    ///   - manifest:
    ///       identifier: manifest1
    ///       type: Values
    ///       spec:
    ///         store:
    ///           type: Github
    ///           spec:
    ///             connectorRef: ""&lt;+input&gt;""
    ///             gitFetchType: Branch
    ///             paths:
    ///               - path-updated
    ///             repoName: ""&lt;+input&gt;""
    ///             branch: master
    ///         skipResourceVersioning: false
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Importing Service Override From Git
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Harness.Platform.ServiceOverridesV2("test", new()
    ///     {
    ///         OrgId = "orgIdentifier",
    ///         ProjectId = "projectIdentifier",
    ///         EnvId = "environmentIdentifier",
    ///         ServiceId = "serviceIdentifier",
    ///         InfraId = "infraIdentifier",
    ///         Type = "INFRA_SERVICE_OVERRIDE",
    ///         ImportFromGit = true,
    ///         GitDetails = new Harness.Platform.Inputs.ServiceOverridesV2GitDetailsArgs
    ///         {
    ///             StoreType = "REMOTE",
    ///             ConnectorRef = "connector_ref",
    ///             RepoName = "repo_name",
    ///             FilePath = "file_path",
    ///             Branch = "branch",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import account level service override
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example &lt;override_id&gt;
    /// ```
    /// 
    /// Import org level service override
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example &lt;org_id&gt;/&lt;override_id&gt;
    /// ```
    /// 
    /// Import project level service override
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/serviceOverridesV2:ServiceOverridesV2 example &lt;org_id&gt;/&lt;project_id&gt;/&lt;override_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/serviceOverridesV2:ServiceOverridesV2")]
    public partial class ServiceOverridesV2 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The cluster ID to which the overrides are associated.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The environment ID to which the overrides are associated.
        /// </summary>
        [Output("envId")]
        public Output<string> EnvId { get; private set; } = null!;

        /// <summary>
        /// Contains parameters related to creating an Entity for Git Experience.
        /// </summary>
        [Output("gitDetails")]
        public Output<Outputs.ServiceOverridesV2GitDetails> GitDetails { get; private set; } = null!;

        /// <summary>
        /// The identifier of the override entity.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// import override from git
        /// </summary>
        [Output("importFromGit")]
        public Output<bool> ImportFromGit { get; private set; } = null!;

        /// <summary>
        /// The infrastructure ID to which the overrides are associated.
        /// </summary>
        [Output("infraId")]
        public Output<string> InfraId { get; private set; } = null!;

        /// <summary>
        /// force import override from remote even if same file path already exist
        /// </summary>
        [Output("isForceImport")]
        public Output<bool> IsForceImport { get; private set; } = null!;

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
        /// The service ID to which the overrides applies.
        /// </summary>
        [Output("serviceId")]
        public Output<string> ServiceId { get; private set; } = null!;

        /// <summary>
        /// The type of the overrides.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The yaml of the overrides spec object.
        /// </summary>
        [Output("yaml")]
        public Output<string> Yaml { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceOverridesV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceOverridesV2(string name, ServiceOverridesV2Args args, CustomResourceOptions? options = null)
            : base("harness:platform/serviceOverridesV2:ServiceOverridesV2", name, args ?? new ServiceOverridesV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceOverridesV2(string name, Input<string> id, ServiceOverridesV2State? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/serviceOverridesV2:ServiceOverridesV2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceOverridesV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceOverridesV2 Get(string name, Input<string> id, ServiceOverridesV2State? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceOverridesV2(name, id, state, options);
        }
    }

    public sealed class ServiceOverridesV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cluster ID to which the overrides are associated.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The environment ID to which the overrides are associated.
        /// </summary>
        [Input("envId", required: true)]
        public Input<string> EnvId { get; set; } = null!;

        /// <summary>
        /// Contains parameters related to creating an Entity for Git Experience.
        /// </summary>
        [Input("gitDetails")]
        public Input<Inputs.ServiceOverridesV2GitDetailsArgs>? GitDetails { get; set; }

        /// <summary>
        /// import override from git
        /// </summary>
        [Input("importFromGit")]
        public Input<bool>? ImportFromGit { get; set; }

        /// <summary>
        /// The infrastructure ID to which the overrides are associated.
        /// </summary>
        [Input("infraId")]
        public Input<string>? InfraId { get; set; }

        /// <summary>
        /// force import override from remote even if same file path already exist
        /// </summary>
        [Input("isForceImport")]
        public Input<bool>? IsForceImport { get; set; }

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
        /// The service ID to which the overrides applies.
        /// </summary>
        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        /// <summary>
        /// The type of the overrides.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The yaml of the overrides spec object.
        /// </summary>
        [Input("yaml")]
        public Input<string>? Yaml { get; set; }

        public ServiceOverridesV2Args()
        {
        }
        public static new ServiceOverridesV2Args Empty => new ServiceOverridesV2Args();
    }

    public sealed class ServiceOverridesV2State : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cluster ID to which the overrides are associated.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The environment ID to which the overrides are associated.
        /// </summary>
        [Input("envId")]
        public Input<string>? EnvId { get; set; }

        /// <summary>
        /// Contains parameters related to creating an Entity for Git Experience.
        /// </summary>
        [Input("gitDetails")]
        public Input<Inputs.ServiceOverridesV2GitDetailsGetArgs>? GitDetails { get; set; }

        /// <summary>
        /// The identifier of the override entity.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// import override from git
        /// </summary>
        [Input("importFromGit")]
        public Input<bool>? ImportFromGit { get; set; }

        /// <summary>
        /// The infrastructure ID to which the overrides are associated.
        /// </summary>
        [Input("infraId")]
        public Input<string>? InfraId { get; set; }

        /// <summary>
        /// force import override from remote even if same file path already exist
        /// </summary>
        [Input("isForceImport")]
        public Input<bool>? IsForceImport { get; set; }

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
        /// The service ID to which the overrides applies.
        /// </summary>
        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        /// <summary>
        /// The type of the overrides.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The yaml of the overrides spec object.
        /// </summary>
        [Input("yaml")]
        public Input<string>? Yaml { get; set; }

        public ServiceOverridesV2State()
        {
        }
        public static new ServiceOverridesV2State Empty => new ServiceOverridesV2State();
    }
}
