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

__all__ = [
    'GetEnvironmentServiceOverridesResult',
    'AwaitableGetEnvironmentServiceOverridesResult',
    'get_environment_service_overrides',
    'get_environment_service_overrides_output',
]

@pulumi.output_type
class GetEnvironmentServiceOverridesResult:
    """
    A collection of values returned by getEnvironmentServiceOverrides.
    """
    def __init__(__self__, env_id=None, id=None, identifier=None, org_id=None, project_id=None, service_id=None, yaml=None):
        if env_id and not isinstance(env_id, str):
            raise TypeError("Expected argument 'env_id' to be a str")
        pulumi.set(__self__, "env_id", env_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if service_id and not isinstance(service_id, str):
            raise TypeError("Expected argument 'service_id' to be a str")
        pulumi.set(__self__, "service_id", service_id)
        if yaml and not isinstance(yaml, str):
            raise TypeError("Expected argument 'yaml' to be a str")
        pulumi.set(__self__, "yaml", yaml)

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> str:
        """
        The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
        """
        return pulumi.get(self, "env_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> str:
        """
        identifier of the service overrides.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[str]:
        """
        The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
        """
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter
    def yaml(self) -> str:
        """
        Environment Service Overrides YAML
        """
        return pulumi.get(self, "yaml")


class AwaitableGetEnvironmentServiceOverridesResult(GetEnvironmentServiceOverridesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEnvironmentServiceOverridesResult(
            env_id=self.env_id,
            id=self.id,
            identifier=self.identifier,
            org_id=self.org_id,
            project_id=self.project_id,
            service_id=self.service_id,
            yaml=self.yaml)


def get_environment_service_overrides(env_id: Optional[str] = None,
                                      identifier: Optional[str] = None,
                                      org_id: Optional[str] = None,
                                      project_id: Optional[str] = None,
                                      service_id: Optional[str] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEnvironmentServiceOverridesResult:
    """
    Data source for Harness environment service overrides.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_environment_service_overrides(org_id="orgIdentifier",
        project_id="projectIdentifier",
        env_id="environmentIdentifier",
        service_id="serviceIdentifier")
    ```


    :param str env_id: The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
    :param str identifier: identifier of the service overrides.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    :param str service_id: The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
    """
    __args__ = dict()
    __args__['envId'] = env_id
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['serviceId'] = service_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getEnvironmentServiceOverrides:getEnvironmentServiceOverrides', __args__, opts=opts, typ=GetEnvironmentServiceOverridesResult).value

    return AwaitableGetEnvironmentServiceOverridesResult(
        env_id=pulumi.get(__ret__, 'env_id'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        service_id=pulumi.get(__ret__, 'service_id'),
        yaml=pulumi.get(__ret__, 'yaml'))
def get_environment_service_overrides_output(env_id: Optional[pulumi.Input[str]] = None,
                                             identifier: Optional[pulumi.Input[Optional[str]]] = None,
                                             org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                             project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                             service_id: Optional[pulumi.Input[Optional[str]]] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEnvironmentServiceOverridesResult]:
    """
    Data source for Harness environment service overrides.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    test = harness.platform.get_environment_service_overrides(org_id="orgIdentifier",
        project_id="projectIdentifier",
        env_id="environmentIdentifier",
        service_id="serviceIdentifier")
    ```


    :param str env_id: The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
    :param str identifier: identifier of the service overrides.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    :param str service_id: The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
    """
    __args__ = dict()
    __args__['envId'] = env_id
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['serviceId'] = service_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getEnvironmentServiceOverrides:getEnvironmentServiceOverrides', __args__, opts=opts, typ=GetEnvironmentServiceOverridesResult)
    return __ret__.apply(lambda __response__: GetEnvironmentServiceOverridesResult(
        env_id=pulumi.get(__response__, 'env_id'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        org_id=pulumi.get(__response__, 'org_id'),
        project_id=pulumi.get(__response__, 'project_id'),
        service_id=pulumi.get(__response__, 'service_id'),
        yaml=pulumi.get(__response__, 'yaml')))
