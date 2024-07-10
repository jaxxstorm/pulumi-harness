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
    /// Resource for creating a Harness service.
    /// 
    /// ## Example to create Service at different levels (Org, Project, Account)
    /// 
    /// ### Account Level
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Harness.Platform.Service("example", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         Description = "test",
    ///         Yaml = @"service:
    ///   name: name
    ///   identifier: identifier
    ///   serviceDefinition:
    ///     spec:
    ///       manifests:
    ///         - manifest:
    ///             identifier: manifest1
    ///             type: K8sManifest
    ///             spec:
    ///               store:
    ///                 type: Github
    ///                 spec:
    ///                   connectorRef: &lt;+input&gt;
    ///                   gitFetchType: Branch
    ///                   paths:
    ///                     - files1
    ///                   repoName: &lt;+input&gt;
    ///                   branch: master
    ///               skipResourceVersioning: false
    ///       configFiles:
    ///         - configFile:
    ///             identifier: configFile1
    ///             spec:
    ///               store:
    ///                 type: Harness
    ///                 spec:
    ///                   files:
    ///                     - &lt;+org.description&gt;
    ///       variables:
    ///         - name: var1
    ///           type: String
    ///           value: val1
    ///         - name: var2
    ///           type: String
    ///           value: val2
    ///     type: Kubernetes
    ///   gitOpsEnabled: false
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Org Level
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Harness.Platform.Service("example", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         Description = "test",
    ///         OrgId = "org_id",
    ///         Yaml = @"service:
    ///   name: name
    ///   identifier: identifier
    ///   serviceDefinition:
    ///     spec:
    ///       manifests:
    ///         - manifest:
    ///             identifier: manifest1
    ///             type: K8sManifest
    ///             spec:
    ///               store:
    ///                 type: Github
    ///                 spec:
    ///                   connectorRef: &lt;+input&gt;
    ///                   gitFetchType: Branch
    ///                   paths:
    ///                     - files1
    ///                   repoName: &lt;+input&gt;
    ///                   branch: master
    ///               skipResourceVersioning: false
    ///       configFiles:
    ///         - configFile:
    ///             identifier: configFile1
    ///             spec:
    ///               store:
    ///                 type: Harness
    ///                 spec:
    ///                   files:
    ///                     - &lt;+org.description&gt;
    ///       variables:
    ///         - name: var1
    ///           type: String
    ///           value: val1
    ///         - name: var2
    ///           type: String
    ///           value: val2
    ///     type: Kubernetes
    ///   gitOpsEnabled: false
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Project Level
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Harness.Platform.Service("example", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         Description = "test",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         Yaml = @"service:
    ///   name: name
    ///   identifier: identifier
    ///   serviceDefinition:
    ///     spec:
    ///       manifests:
    ///         - manifest:
    ///             identifier: manifest1
    ///             type: K8sManifest
    ///             spec:
    ///               store:
    ///                 type: Github
    ///                 spec:
    ///                   connectorRef: &lt;+input&gt;
    ///                   gitFetchType: Branch
    ///                   paths:
    ///                     - files1
    ///                   repoName: &lt;+input&gt;
    ///                   branch: master
    ///               skipResourceVersioning: false
    ///       configFiles:
    ///         - configFile:
    ///             identifier: configFile1
    ///             spec:
    ///               store:
    ///                 type: Harness
    ///                 spec:
    ///                   files:
    ///                     - &lt;+org.description&gt;
    ///       variables:
    ///         - name: var1
    ///           type: String
    ///           value: val1
    ///         - name: var2
    ///           type: String
    ///           value: val2
    ///     type: Kubernetes
    ///   gitOpsEnabled: false
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Creating Remote Service
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Harness.Platform.Service("example", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         Description = "test",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         GitDetails = new Harness.Platform.Inputs.ServiceGitDetailsArgs
    ///         {
    ///             StoreType = "REMOTE",
    ///             ConnectorRef = "connector_ref",
    ///             RepoName = "repo_name",
    ///             FilePath = "file_path",
    ///             Branch = "branch",
    ///         },
    ///         Yaml = @"service:
    ///   name: name
    ///   identifier: identifier
    ///   serviceDefinition:
    ///     spec:
    ///       manifests:
    ///         - manifest:
    ///             identifier: manifest1
    ///             type: K8sManifest
    ///             spec:
    ///               store:
    ///                 type: Github
    ///                 spec:
    ///                   connectorRef: &lt;+input&gt;
    ///                   gitFetchType: Branch
    ///                   paths:
    ///                     - files1
    ///                   repoName: &lt;+input&gt;
    ///                   branch: master
    ///               skipResourceVersioning: false
    ///       configFiles:
    ///         - configFile:
    ///             identifier: configFile1
    ///             spec:
    ///               store:
    ///                 type: Harness
    ///                 spec:
    ///                   files:
    ///                     - &lt;+org.description&gt;
    ///       variables:
    ///         - name: var1
    ///           type: String
    ///           value: val1
    ///         - name: var2
    ///           type: String
    ///           value: val2
    ///     type: Kubernetes
    ///   gitOpsEnabled: false
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Importing Service From Git
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Harness.Platform.Service("example", new()
    ///     {
    ///         Identifier = "identifier",
    ///         Name = "name",
    ///         ImportFromGit = true,
    ///         GitDetails = new Harness.Platform.Inputs.ServiceGitDetailsArgs
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
    /// Import account level service
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/service:Service example &lt;service_id&gt;
    /// ```
    /// 
    /// Import org level service
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/service:Service example &lt;org_id&gt;/&lt;service_id&gt;
    /// ```
    /// 
    /// Import project level service
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/service:Service example &lt;org_id&gt;/&lt;project_id&gt;/&lt;service_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/service:Service")]
    public partial class Service : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// to fetch resoled service yaml
        /// </summary>
        [Output("fetchResolvedYaml")]
        public Output<bool> FetchResolvedYaml { get; private set; } = null!;

        /// <summary>
        /// Enable this flag for force deletion of service
        /// </summary>
        [Output("forceDelete")]
        public Output<string> ForceDelete { get; private set; } = null!;

        /// <summary>
        /// Contains parameters related to Git Experience for remote entities
        /// </summary>
        [Output("gitDetails")]
        public Output<Outputs.ServiceGitDetails> GitDetails { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// import service from git
        /// </summary>
        [Output("importFromGit")]
        public Output<bool> ImportFromGit { get; private set; } = null!;

        /// <summary>
        /// force import service from remote even if same file path already exist
        /// </summary>
        [Output("isForceImport")]
        public Output<bool> IsForceImport { get; private set; } = null!;

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
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Service YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
        /// org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
        /// connectorRef: org.connectorId.
        /// </summary>
        [Output("yaml")]
        public Output<string> Yaml { get; private set; } = null!;


        /// <summary>
        /// Create a Service resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Service(string name, ServiceArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/service:Service", name, args ?? new ServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Service(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/service:Service", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Service resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Service Get(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new Service(name, id, state, options);
        }
    }

    public sealed class ServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// to fetch resoled service yaml
        /// </summary>
        [Input("fetchResolvedYaml")]
        public Input<bool>? FetchResolvedYaml { get; set; }

        /// <summary>
        /// Enable this flag for force deletion of service
        /// </summary>
        [Input("forceDelete")]
        public Input<string>? ForceDelete { get; set; }

        /// <summary>
        /// Contains parameters related to Git Experience for remote entities
        /// </summary>
        [Input("gitDetails")]
        public Input<Inputs.ServiceGitDetailsArgs>? GitDetails { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// import service from git
        /// </summary>
        [Input("importFromGit")]
        public Input<bool>? ImportFromGit { get; set; }

        /// <summary>
        /// force import service from remote even if same file path already exist
        /// </summary>
        [Input("isForceImport")]
        public Input<bool>? IsForceImport { get; set; }

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
        /// Service YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
        /// org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
        /// connectorRef: org.connectorId.
        /// </summary>
        [Input("yaml")]
        public Input<string>? Yaml { get; set; }

        public ServiceArgs()
        {
        }
        public static new ServiceArgs Empty => new ServiceArgs();
    }

    public sealed class ServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// to fetch resoled service yaml
        /// </summary>
        [Input("fetchResolvedYaml")]
        public Input<bool>? FetchResolvedYaml { get; set; }

        /// <summary>
        /// Enable this flag for force deletion of service
        /// </summary>
        [Input("forceDelete")]
        public Input<string>? ForceDelete { get; set; }

        /// <summary>
        /// Contains parameters related to Git Experience for remote entities
        /// </summary>
        [Input("gitDetails")]
        public Input<Inputs.ServiceGitDetailsGetArgs>? GitDetails { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// import service from git
        /// </summary>
        [Input("importFromGit")]
        public Input<bool>? ImportFromGit { get; set; }

        /// <summary>
        /// force import service from remote even if same file path already exist
        /// </summary>
        [Input("isForceImport")]
        public Input<bool>? IsForceImport { get; set; }

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
        /// Service YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression:
        /// org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as
        /// connectorRef: org.connectorId.
        /// </summary>
        [Input("yaml")]
        public Input<string>? Yaml { get; set; }

        public ServiceState()
        {
        }
        public static new ServiceState Empty => new ServiceState();
    }
}
