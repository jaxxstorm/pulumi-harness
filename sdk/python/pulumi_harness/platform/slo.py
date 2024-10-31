# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SloArgs', 'Slo']

@pulumi.input_type
class SloArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 org_id: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 request: Optional[pulumi.Input['SloRequestArgs']] = None):
        """
        The set of arguments for constructing a Slo resource.
        :param pulumi.Input[str] identifier: Identifier of the SLO.
        :param pulumi.Input[str] org_id: Identifier of the organization in which the SLO is configured.
        :param pulumi.Input[str] project_id: Identifier of the project in which the SLO is configured.
        :param pulumi.Input['SloRequestArgs'] request: Request for creating or updating SLO.
        """
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "project_id", project_id)
        if request is not None:
            pulumi.set(__self__, "request", request)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        Identifier of the SLO.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        """
        Identifier of the organization in which the SLO is configured.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Identifier of the project in which the SLO is configured.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def request(self) -> Optional[pulumi.Input['SloRequestArgs']]:
        """
        Request for creating or updating SLO.
        """
        return pulumi.get(self, "request")

    @request.setter
    def request(self, value: Optional[pulumi.Input['SloRequestArgs']]):
        pulumi.set(self, "request", value)


@pulumi.input_type
class _SloState:
    def __init__(__self__, *,
                 identifier: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 request: Optional[pulumi.Input['SloRequestArgs']] = None):
        """
        Input properties used for looking up and filtering Slo resources.
        :param pulumi.Input[str] identifier: Identifier of the SLO.
        :param pulumi.Input[str] org_id: Identifier of the organization in which the SLO is configured.
        :param pulumi.Input[str] project_id: Identifier of the project in which the SLO is configured.
        :param pulumi.Input['SloRequestArgs'] request: Request for creating or updating SLO.
        """
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if request is not None:
            pulumi.set(__self__, "request", request)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the SLO.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the organization in which the SLO is configured.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the project in which the SLO is configured.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def request(self) -> Optional[pulumi.Input['SloRequestArgs']]:
        """
        Request for creating or updating SLO.
        """
        return pulumi.get(self, "request")

    @request.setter
    def request(self, value: Optional[pulumi.Input['SloRequestArgs']]):
        pulumi.set(self, "request", value)


class Slo(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 request: Optional[pulumi.Input[Union['SloRequestArgs', 'SloRequestArgsDict']]] = None,
                 __props__=None):
        """
        Resource for creating an SLO.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_harness as harness

        example = harness.platform.Slo("example",
            org_id="default",
            project_id="default_project",
            identifier="TerraformSLO",
            request={
                "name": "TSLO",
                "description": "description",
                "tags": [
                    "foo:bar",
                    "bar:foo",
                ],
                "user_journey_refs": [
                    "one",
                    "two",
                ],
                "slo_target": {
                    "type": "Calender",
                    "slo_target_percentage": 10,
                    "spec": json.dumps({
                        "type": "Monthly",
                        "spec": {
                            "dayOfMonth": 5,
                        },
                    }),
                },
                "type": "Simple",
                "spec": json.dumps({
                    "monitoredServiceRef": "monitoredServiceRef",
                    "serviceLevelIndicatorType": "Availability",
                    "serviceLevelIndicators": [{
                        "name": "name",
                        "identifier": "identifier",
                        "type": "Window",
                        "spec": {
                            "type": "Threshold",
                            "spec": {
                                "metric1": "metric1",
                                "thresholdValue": 10,
                                "thresholdType": ">",
                            },
                            "sliMissingDataType": "Good",
                        },
                    }],
                }),
                "notification_rule_refs": [{
                    "notification_rule_ref": "notification_rule_ref",
                    "enabled": True,
                }],
            })
        ```

        Note the above example is for "Threshold" SLI type, if you want to use
        "Ratio", the SLI should be changed appropriately.
        Here's an example of SLO target and Spec for "Ratio" based SLI and
        "Rolling" SLO target.

        ## Import

        Import account level SLO

        ```sh
        $ pulumi import harness:platform/slo:Slo example <slo_id>
        ```

        Import organization level SLO

        ```sh
        $ pulumi import harness:platform/slo:Slo example <org_id>/<slo_id>
        ```

        Import project level SLO

        ```sh
        $ pulumi import harness:platform/slo:Slo example <org_id>/<project_id>/<slo_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] identifier: Identifier of the SLO.
        :param pulumi.Input[str] org_id: Identifier of the organization in which the SLO is configured.
        :param pulumi.Input[str] project_id: Identifier of the project in which the SLO is configured.
        :param pulumi.Input[Union['SloRequestArgs', 'SloRequestArgsDict']] request: Request for creating or updating SLO.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SloArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating an SLO.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_harness as harness

        example = harness.platform.Slo("example",
            org_id="default",
            project_id="default_project",
            identifier="TerraformSLO",
            request={
                "name": "TSLO",
                "description": "description",
                "tags": [
                    "foo:bar",
                    "bar:foo",
                ],
                "user_journey_refs": [
                    "one",
                    "two",
                ],
                "slo_target": {
                    "type": "Calender",
                    "slo_target_percentage": 10,
                    "spec": json.dumps({
                        "type": "Monthly",
                        "spec": {
                            "dayOfMonth": 5,
                        },
                    }),
                },
                "type": "Simple",
                "spec": json.dumps({
                    "monitoredServiceRef": "monitoredServiceRef",
                    "serviceLevelIndicatorType": "Availability",
                    "serviceLevelIndicators": [{
                        "name": "name",
                        "identifier": "identifier",
                        "type": "Window",
                        "spec": {
                            "type": "Threshold",
                            "spec": {
                                "metric1": "metric1",
                                "thresholdValue": 10,
                                "thresholdType": ">",
                            },
                            "sliMissingDataType": "Good",
                        },
                    }],
                }),
                "notification_rule_refs": [{
                    "notification_rule_ref": "notification_rule_ref",
                    "enabled": True,
                }],
            })
        ```

        Note the above example is for "Threshold" SLI type, if you want to use
        "Ratio", the SLI should be changed appropriately.
        Here's an example of SLO target and Spec for "Ratio" based SLI and
        "Rolling" SLO target.

        ## Import

        Import account level SLO

        ```sh
        $ pulumi import harness:platform/slo:Slo example <slo_id>
        ```

        Import organization level SLO

        ```sh
        $ pulumi import harness:platform/slo:Slo example <org_id>/<slo_id>
        ```

        Import project level SLO

        ```sh
        $ pulumi import harness:platform/slo:Slo example <org_id>/<project_id>/<slo_id>
        ```

        :param str resource_name: The name of the resource.
        :param SloArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SloArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 request: Optional[pulumi.Input[Union['SloRequestArgs', 'SloRequestArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SloArgs.__new__(SloArgs)

            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["request"] = request
        super(Slo, __self__).__init__(
            'harness:platform/slo:Slo',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            request: Optional[pulumi.Input[Union['SloRequestArgs', 'SloRequestArgsDict']]] = None) -> 'Slo':
        """
        Get an existing Slo resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] identifier: Identifier of the SLO.
        :param pulumi.Input[str] org_id: Identifier of the organization in which the SLO is configured.
        :param pulumi.Input[str] project_id: Identifier of the project in which the SLO is configured.
        :param pulumi.Input[Union['SloRequestArgs', 'SloRequestArgsDict']] request: Request for creating or updating SLO.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SloState.__new__(_SloState)

        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["request"] = request
        return Slo(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Identifier of the SLO.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        Identifier of the organization in which the SLO is configured.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Identifier of the project in which the SLO is configured.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def request(self) -> pulumi.Output[Optional['outputs.SloRequest']]:
        """
        Request for creating or updating SLO.
        """
        return pulumi.get(self, "request")

