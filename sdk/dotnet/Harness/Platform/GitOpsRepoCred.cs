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
    /// Resource for creating a Harness Gitops Repositories Credentials.
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
    ///     var test = new Harness.Platform.GitOpsRepoCred("test", new()
    ///     {
    ///         Identifier = "identifier",
    ///         AccountId = "account_id",
    ///         AgentId = "agent_id",
    ///         ProjectId = "project_id",
    ///         OrgId = "org_id",
    ///         Creds = new[]
    ///         {
    ///             new Harness.Platform.Inputs.GitOpsRepoCredCredArgs
    ///             {
    ///                 Type = "git",
    ///                 Url = "github.com",
    ///                 SshPrivateKey = "yoursshprivatekey",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import a Account level Gitops Repository Credentials
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/gitOpsRepoCred:GitOpsRepoCred example &lt;agent_id&gt;/&lt;repocred_id&gt;
    /// ```
    /// 
    ///  Import a Project level Gitops Repository Credentials
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/gitOpsRepoCred:GitOpsRepoCred example &lt;organization_id&gt;/&lt;project_id&gt;/&lt;agent_id&gt;/&lt;repocred_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/gitOpsRepoCred:GitOpsRepoCred")]
    public partial class GitOpsRepoCred : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account identifier of the Repository Credential.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Agent identifier of the Repository Credential.
        /// </summary>
        [Output("agentId")]
        public Output<string> AgentId { get; private set; } = null!;

        /// <summary>
        /// credential details.
        /// </summary>
        [Output("creds")]
        public Output<ImmutableArray<Outputs.GitOpsRepoCredCred>> Creds { get; private set; } = null!;

        /// <summary>
        /// Identifier of the Repository Credential.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Organization identifier of the Repository Credential.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Project identifier of the Repository Credential.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// if the Repository credential should be upserted.
        /// </summary>
        [Output("upsert")]
        public Output<bool?> Upsert { get; private set; } = null!;


        /// <summary>
        /// Create a GitOpsRepoCred resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GitOpsRepoCred(string name, GitOpsRepoCredArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/gitOpsRepoCred:GitOpsRepoCred", name, args ?? new GitOpsRepoCredArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GitOpsRepoCred(string name, Input<string> id, GitOpsRepoCredState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/gitOpsRepoCred:GitOpsRepoCred", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GitOpsRepoCred resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GitOpsRepoCred Get(string name, Input<string> id, GitOpsRepoCredState? state = null, CustomResourceOptions? options = null)
        {
            return new GitOpsRepoCred(name, id, state, options);
        }
    }

    public sealed class GitOpsRepoCredArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account identifier of the Repository Credential.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Agent identifier of the Repository Credential.
        /// </summary>
        [Input("agentId", required: true)]
        public Input<string> AgentId { get; set; } = null!;

        [Input("creds")]
        private InputList<Inputs.GitOpsRepoCredCredArgs>? _creds;

        /// <summary>
        /// credential details.
        /// </summary>
        public InputList<Inputs.GitOpsRepoCredCredArgs> Creds
        {
            get => _creds ?? (_creds = new InputList<Inputs.GitOpsRepoCredCredArgs>());
            set => _creds = value;
        }

        /// <summary>
        /// Identifier of the Repository Credential.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Organization identifier of the Repository Credential.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project identifier of the Repository Credential.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// if the Repository credential should be upserted.
        /// </summary>
        [Input("upsert")]
        public Input<bool>? Upsert { get; set; }

        public GitOpsRepoCredArgs()
        {
        }
        public static new GitOpsRepoCredArgs Empty => new GitOpsRepoCredArgs();
    }

    public sealed class GitOpsRepoCredState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account identifier of the Repository Credential.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Agent identifier of the Repository Credential.
        /// </summary>
        [Input("agentId")]
        public Input<string>? AgentId { get; set; }

        [Input("creds")]
        private InputList<Inputs.GitOpsRepoCredCredGetArgs>? _creds;

        /// <summary>
        /// credential details.
        /// </summary>
        public InputList<Inputs.GitOpsRepoCredCredGetArgs> Creds
        {
            get => _creds ?? (_creds = new InputList<Inputs.GitOpsRepoCredCredGetArgs>());
            set => _creds = value;
        }

        /// <summary>
        /// Identifier of the Repository Credential.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Organization identifier of the Repository Credential.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project identifier of the Repository Credential.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// if the Repository credential should be upserted.
        /// </summary>
        [Input("upsert")]
        public Input<bool>? Upsert { get; set; }

        public GitOpsRepoCredState()
        {
        }
        public static new GitOpsRepoCredState Empty => new GitOpsRepoCredState();
    }
}
