// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class JiraConnectorAuthGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication types for Jira connector
        /// </summary>
        [Input("authType", required: true)]
        public Input<string> AuthType { get; set; } = null!;

        /// <summary>
        /// Authenticate using username password.
        /// </summary>
        [Input("usernamePassword")]
        public Input<Inputs.JiraConnectorAuthUsernamePasswordGetArgs>? UsernamePassword { get; set; }

        public JiraConnectorAuthGetArgs()
        {
        }
        public static new JiraConnectorAuthGetArgs Empty => new JiraConnectorAuthGetArgs();
    }
}