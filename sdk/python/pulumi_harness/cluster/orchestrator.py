# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['OrchestratorArgs', 'Orchestrator']

@pulumi.input_type
class OrchestratorArgs:
    def __init__(__self__, *,
                 cluster_endpoint: pulumi.Input[str],
                 k8s_connector_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Orchestrator resource.
        :param pulumi.Input[str] cluster_endpoint: Endpoint of the k8s cluster being onboarded under the orchestrator
        :param pulumi.Input[str] k8s_connector_id: ID of the Harness Kubernetes Connector Being used
        :param pulumi.Input[str] name: Name of the Orchestrator
        """
        pulumi.set(__self__, "cluster_endpoint", cluster_endpoint)
        pulumi.set(__self__, "k8s_connector_id", k8s_connector_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="clusterEndpoint")
    def cluster_endpoint(self) -> pulumi.Input[str]:
        """
        Endpoint of the k8s cluster being onboarded under the orchestrator
        """
        return pulumi.get(self, "cluster_endpoint")

    @cluster_endpoint.setter
    def cluster_endpoint(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_endpoint", value)

    @property
    @pulumi.getter(name="k8sConnectorId")
    def k8s_connector_id(self) -> pulumi.Input[str]:
        """
        ID of the Harness Kubernetes Connector Being used
        """
        return pulumi.get(self, "k8s_connector_id")

    @k8s_connector_id.setter
    def k8s_connector_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "k8s_connector_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Orchestrator
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _OrchestratorState:
    def __init__(__self__, *,
                 cluster_endpoint: Optional[pulumi.Input[str]] = None,
                 k8s_connector_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Orchestrator resources.
        :param pulumi.Input[str] cluster_endpoint: Endpoint of the k8s cluster being onboarded under the orchestrator
        :param pulumi.Input[str] k8s_connector_id: ID of the Harness Kubernetes Connector Being used
        :param pulumi.Input[str] name: Name of the Orchestrator
        """
        if cluster_endpoint is not None:
            pulumi.set(__self__, "cluster_endpoint", cluster_endpoint)
        if k8s_connector_id is not None:
            pulumi.set(__self__, "k8s_connector_id", k8s_connector_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="clusterEndpoint")
    def cluster_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        Endpoint of the k8s cluster being onboarded under the orchestrator
        """
        return pulumi.get(self, "cluster_endpoint")

    @cluster_endpoint.setter
    def cluster_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_endpoint", value)

    @property
    @pulumi.getter(name="k8sConnectorId")
    def k8s_connector_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the Harness Kubernetes Connector Being used
        """
        return pulumi.get(self, "k8s_connector_id")

    @k8s_connector_id.setter
    def k8s_connector_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "k8s_connector_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Orchestrator
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class Orchestrator(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_endpoint: Optional[pulumi.Input[str]] = None,
                 k8s_connector_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for creating ClusterOrchestrators.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.cluster.Orchestrator("test",
            name="name",
            cluster_endpoint="http://test.test.com",
            k8s_connector_id="test")
        ```

        ## Import

        Import using the Harness aws cloud provider id.

        ```sh
        $ pulumi import harness:cluster/orchestrator:Orchestrator example <provider_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_endpoint: Endpoint of the k8s cluster being onboarded under the orchestrator
        :param pulumi.Input[str] k8s_connector_id: ID of the Harness Kubernetes Connector Being used
        :param pulumi.Input[str] name: Name of the Orchestrator
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrchestratorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating ClusterOrchestrators.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        test = harness.cluster.Orchestrator("test",
            name="name",
            cluster_endpoint="http://test.test.com",
            k8s_connector_id="test")
        ```

        ## Import

        Import using the Harness aws cloud provider id.

        ```sh
        $ pulumi import harness:cluster/orchestrator:Orchestrator example <provider_id>
        ```

        :param str resource_name: The name of the resource.
        :param OrchestratorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrchestratorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_endpoint: Optional[pulumi.Input[str]] = None,
                 k8s_connector_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrchestratorArgs.__new__(OrchestratorArgs)

            if cluster_endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_endpoint'")
            __props__.__dict__["cluster_endpoint"] = cluster_endpoint
            if k8s_connector_id is None and not opts.urn:
                raise TypeError("Missing required property 'k8s_connector_id'")
            __props__.__dict__["k8s_connector_id"] = k8s_connector_id
            __props__.__dict__["name"] = name
        super(Orchestrator, __self__).__init__(
            'harness:cluster/orchestrator:Orchestrator',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_endpoint: Optional[pulumi.Input[str]] = None,
            k8s_connector_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'Orchestrator':
        """
        Get an existing Orchestrator resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_endpoint: Endpoint of the k8s cluster being onboarded under the orchestrator
        :param pulumi.Input[str] k8s_connector_id: ID of the Harness Kubernetes Connector Being used
        :param pulumi.Input[str] name: Name of the Orchestrator
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrchestratorState.__new__(_OrchestratorState)

        __props__.__dict__["cluster_endpoint"] = cluster_endpoint
        __props__.__dict__["k8s_connector_id"] = k8s_connector_id
        __props__.__dict__["name"] = name
        return Orchestrator(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterEndpoint")
    def cluster_endpoint(self) -> pulumi.Output[str]:
        """
        Endpoint of the k8s cluster being onboarded under the orchestrator
        """
        return pulumi.get(self, "cluster_endpoint")

    @property
    @pulumi.getter(name="k8sConnectorId")
    def k8s_connector_id(self) -> pulumi.Output[str]:
        """
        ID of the Harness Kubernetes Connector Being used
        """
        return pulumi.get(self, "k8s_connector_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Orchestrator
        """
        return pulumi.get(self, "name")

