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

    public sealed class JenkinsConnectorAuthArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authenticate to App Dynamics using bearer token.
        /// </summary>
        [Input("jenkinsBearerToken")]
        public Input<Inputs.JenkinsConnectorAuthJenkinsBearerTokenArgs>? JenkinsBearerToken { get; set; }

        /// <summary>
        /// Authenticate to App Dynamics using user name and password.
        /// </summary>
        [Input("jenkinsUserNamePassword")]
        public Input<Inputs.JenkinsConnectorAuthJenkinsUserNamePasswordArgs>? JenkinsUserNamePassword { get; set; }

        /// <summary>
        /// Can be one of UsernamePassword, Anonymous, Bearer Token(HTTP Header)
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public JenkinsConnectorAuthArgs()
        {
        }
        public static new JenkinsConnectorAuthArgs Empty => new JenkinsConnectorAuthArgs();
    }
}
