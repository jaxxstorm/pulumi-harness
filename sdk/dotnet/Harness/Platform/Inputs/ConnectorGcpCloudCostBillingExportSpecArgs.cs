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

    public sealed class ConnectorGcpCloudCostBillingExportSpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Data Set Id.
        /// </summary>
        [Input("dataSetId", required: true)]
        public Input<string> DataSetId { get; set; } = null!;

        /// <summary>
        /// Table Id.
        /// </summary>
        [Input("tableId", required: true)]
        public Input<string> TableId { get; set; } = null!;

        public ConnectorGcpCloudCostBillingExportSpecArgs()
        {
        }
        public static new ConnectorGcpCloudCostBillingExportSpecArgs Empty => new ConnectorGcpCloudCostBillingExportSpecArgs();
    }
}
