// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class GitlabConnectorApiAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Personal access token for interacting with the gitlab api. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("tokenRef", required: true)]
        public Input<string> TokenRef { get; set; } = null!;

        public GitlabConnectorApiAuthenticationArgs()
        {
        }
        public static new GitlabConnectorApiAuthenticationArgs Empty => new GitlabConnectorApiAuthenticationArgs();
    }
}
