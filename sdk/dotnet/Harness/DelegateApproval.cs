// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness
{
    /// <summary>
    /// Resource for approving or rejecting delegates.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Lbrlabs.PulumiPackage.Harness;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testDelegate = Harness.GetDelegate.Invoke(new()
    ///     {
    ///         Name = "my-delegate",
    ///     });
    /// 
    ///     var testDelegateApproval = new Harness.DelegateApproval("testDelegateApproval", new()
    ///     {
    ///         DelegateId = testDelegate.Apply(getDelegateResult =&gt; getDelegateResult.Id),
    ///         Approve = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import the status of the delegate approval.
    /// 
    /// ```sh
    ///  $ pulumi import harness:index/delegateApproval:DelegateApproval example &lt;delegate_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:index/delegateApproval:DelegateApproval")]
    public partial class DelegateApproval : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether or not to approve the delegate.
        /// </summary>
        [Output("approve")]
        public Output<bool> Approve { get; private set; } = null!;

        /// <summary>
        /// The id of the delegate.
        /// </summary>
        [Output("delegateId")]
        public Output<string> DelegateId { get; private set; } = null!;

        /// <summary>
        /// The status of the delegate.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a DelegateApproval resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DelegateApproval(string name, DelegateApprovalArgs args, CustomResourceOptions? options = null)
            : base("harness:index/delegateApproval:DelegateApproval", name, args ?? new DelegateApprovalArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DelegateApproval(string name, Input<string> id, DelegateApprovalState? state = null, CustomResourceOptions? options = null)
            : base("harness:index/delegateApproval:DelegateApproval", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DelegateApproval resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DelegateApproval Get(string name, Input<string> id, DelegateApprovalState? state = null, CustomResourceOptions? options = null)
        {
            return new DelegateApproval(name, id, state, options);
        }
    }

    public sealed class DelegateApprovalArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether or not to approve the delegate.
        /// </summary>
        [Input("approve", required: true)]
        public Input<bool> Approve { get; set; } = null!;

        /// <summary>
        /// The id of the delegate.
        /// </summary>
        [Input("delegateId", required: true)]
        public Input<string> DelegateId { get; set; } = null!;

        public DelegateApprovalArgs()
        {
        }
        public static new DelegateApprovalArgs Empty => new DelegateApprovalArgs();
    }

    public sealed class DelegateApprovalState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether or not to approve the delegate.
        /// </summary>
        [Input("approve")]
        public Input<bool>? Approve { get; set; }

        /// <summary>
        /// The id of the delegate.
        /// </summary>
        [Input("delegateId")]
        public Input<string>? DelegateId { get; set; }

        /// <summary>
        /// The status of the delegate.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public DelegateApprovalState()
        {
        }
        public static new DelegateApprovalState Empty => new DelegateApprovalState();
    }
}
