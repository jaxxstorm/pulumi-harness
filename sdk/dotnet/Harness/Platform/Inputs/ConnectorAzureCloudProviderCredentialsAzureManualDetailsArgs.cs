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

    public sealed class ConnectorAzureCloudProviderCredentialsAzureManualDetailsArgs : global::Pulumi.ResourceArgs
    {
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        [Input("auth")]
        public Input<Inputs.ConnectorAzureCloudProviderCredentialsAzureManualDetailsAuthArgs>? Auth { get; set; }

        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public ConnectorAzureCloudProviderCredentialsAzureManualDetailsArgs()
        {
        }
        public static new ConnectorAzureCloudProviderCredentialsAzureManualDetailsArgs Empty => new ConnectorAzureCloudProviderCredentialsAzureManualDetailsArgs();
    }
}
