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
    'GetInfraModuleResult',
    'AwaitableGetInfraModuleResult',
    'get_infra_module',
    'get_infra_module_output',
]

@pulumi.output_type
class GetInfraModuleResult:
    """
    A collection of values returned by getInfraModule.
    """
    def __init__(__self__, created=None, description=None, id=None, name=None, repository=None, repository_branch=None, repository_commit=None, repository_connector=None, repository_path=None, repository_url=None, synced=None, system=None, tags=None):
        if created and not isinstance(created, int):
            raise TypeError("Expected argument 'created' to be a int")
        pulumi.set(__self__, "created", created)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if repository and not isinstance(repository, str):
            raise TypeError("Expected argument 'repository' to be a str")
        pulumi.set(__self__, "repository", repository)
        if repository_branch and not isinstance(repository_branch, str):
            raise TypeError("Expected argument 'repository_branch' to be a str")
        pulumi.set(__self__, "repository_branch", repository_branch)
        if repository_commit and not isinstance(repository_commit, str):
            raise TypeError("Expected argument 'repository_commit' to be a str")
        pulumi.set(__self__, "repository_commit", repository_commit)
        if repository_connector and not isinstance(repository_connector, str):
            raise TypeError("Expected argument 'repository_connector' to be a str")
        pulumi.set(__self__, "repository_connector", repository_connector)
        if repository_path and not isinstance(repository_path, str):
            raise TypeError("Expected argument 'repository_path' to be a str")
        pulumi.set(__self__, "repository_path", repository_path)
        if repository_url and not isinstance(repository_url, str):
            raise TypeError("Expected argument 'repository_url' to be a str")
        pulumi.set(__self__, "repository_url", repository_url)
        if synced and not isinstance(synced, int):
            raise TypeError("Expected argument 'synced' to be a int")
        pulumi.set(__self__, "synced", synced)
        if system and not isinstance(system, str):
            raise TypeError("Expected argument 'system' to be a str")
        pulumi.set(__self__, "system", system)
        if tags and not isinstance(tags, str):
            raise TypeError("Expected argument 'tags' to be a str")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def created(self) -> int:
        """
        Timestamp when the module was created
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the module
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Identifier of the module
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the module
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def repository(self) -> str:
        """
        For account connectors, the repository where the module is stored
        """
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter(name="repositoryBranch")
    def repository_branch(self) -> str:
        """
        Repository Branch in which the module should be accessed
        """
        return pulumi.get(self, "repository_branch")

    @property
    @pulumi.getter(name="repositoryCommit")
    def repository_commit(self) -> str:
        """
        Repository Commit in which the module should be accessed
        """
        return pulumi.get(self, "repository_commit")

    @property
    @pulumi.getter(name="repositoryConnector")
    def repository_connector(self) -> str:
        """
        Repository Connector is the reference to the connector for the repository
        """
        return pulumi.get(self, "repository_connector")

    @property
    @pulumi.getter(name="repositoryPath")
    def repository_path(self) -> str:
        """
        Repository Path is the path in which the module resides
        """
        return pulumi.get(self, "repository_path")

    @property
    @pulumi.getter(name="repositoryUrl")
    def repository_url(self) -> str:
        """
        URL where the module is stored
        """
        return pulumi.get(self, "repository_url")

    @property
    @pulumi.getter
    def synced(self) -> int:
        """
        Timestamp when the module was last synced
        """
        return pulumi.get(self, "synced")

    @property
    @pulumi.getter
    def system(self) -> str:
        """
        Provider of the module
        """
        return pulumi.get(self, "system")

    @property
    @pulumi.getter
    def tags(self) -> str:
        """
        Tags associated with the module
        """
        return pulumi.get(self, "tags")


class AwaitableGetInfraModuleResult(GetInfraModuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInfraModuleResult(
            created=self.created,
            description=self.description,
            id=self.id,
            name=self.name,
            repository=self.repository,
            repository_branch=self.repository_branch,
            repository_commit=self.repository_commit,
            repository_connector=self.repository_connector,
            repository_path=self.repository_path,
            repository_url=self.repository_url,
            synced=self.synced,
            system=self.system,
            tags=self.tags)


def get_infra_module(created: Optional[int] = None,
                     description: Optional[str] = None,
                     id: Optional[str] = None,
                     name: Optional[str] = None,
                     repository: Optional[str] = None,
                     repository_branch: Optional[str] = None,
                     repository_commit: Optional[str] = None,
                     repository_connector: Optional[str] = None,
                     repository_path: Optional[str] = None,
                     repository_url: Optional[str] = None,
                     synced: Optional[int] = None,
                     system: Optional[str] = None,
                     tags: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInfraModuleResult:
    """
    Data source for retrieving modules from the module registry.


    :param int created: Timestamp when the module was created
    :param str description: Description of the module
    :param str id: Identifier of the module
    :param str name: Name of the module
    :param str repository: For account connectors, the repository where the module is stored
    :param str repository_branch: Repository Branch in which the module should be accessed
    :param str repository_commit: Repository Commit in which the module should be accessed
    :param str repository_connector: Repository Connector is the reference to the connector for the repository
    :param str repository_path: Repository Path is the path in which the module resides
    :param str repository_url: URL where the module is stored
    :param int synced: Timestamp when the module was last synced
    :param str system: Provider of the module
    :param str tags: Tags associated with the module
    """
    __args__ = dict()
    __args__['created'] = created
    __args__['description'] = description
    __args__['id'] = id
    __args__['name'] = name
    __args__['repository'] = repository
    __args__['repositoryBranch'] = repository_branch
    __args__['repositoryCommit'] = repository_commit
    __args__['repositoryConnector'] = repository_connector
    __args__['repositoryPath'] = repository_path
    __args__['repositoryUrl'] = repository_url
    __args__['synced'] = synced
    __args__['system'] = system
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getInfraModule:getInfraModule', __args__, opts=opts, typ=GetInfraModuleResult).value

    return AwaitableGetInfraModuleResult(
        created=pulumi.get(__ret__, 'created'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        repository=pulumi.get(__ret__, 'repository'),
        repository_branch=pulumi.get(__ret__, 'repository_branch'),
        repository_commit=pulumi.get(__ret__, 'repository_commit'),
        repository_connector=pulumi.get(__ret__, 'repository_connector'),
        repository_path=pulumi.get(__ret__, 'repository_path'),
        repository_url=pulumi.get(__ret__, 'repository_url'),
        synced=pulumi.get(__ret__, 'synced'),
        system=pulumi.get(__ret__, 'system'),
        tags=pulumi.get(__ret__, 'tags'))
def get_infra_module_output(created: Optional[pulumi.Input[Optional[int]]] = None,
                            description: Optional[pulumi.Input[Optional[str]]] = None,
                            id: Optional[pulumi.Input[str]] = None,
                            name: Optional[pulumi.Input[str]] = None,
                            repository: Optional[pulumi.Input[Optional[str]]] = None,
                            repository_branch: Optional[pulumi.Input[Optional[str]]] = None,
                            repository_commit: Optional[pulumi.Input[Optional[str]]] = None,
                            repository_connector: Optional[pulumi.Input[Optional[str]]] = None,
                            repository_path: Optional[pulumi.Input[Optional[str]]] = None,
                            repository_url: Optional[pulumi.Input[Optional[str]]] = None,
                            synced: Optional[pulumi.Input[Optional[int]]] = None,
                            system: Optional[pulumi.Input[str]] = None,
                            tags: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInfraModuleResult]:
    """
    Data source for retrieving modules from the module registry.


    :param int created: Timestamp when the module was created
    :param str description: Description of the module
    :param str id: Identifier of the module
    :param str name: Name of the module
    :param str repository: For account connectors, the repository where the module is stored
    :param str repository_branch: Repository Branch in which the module should be accessed
    :param str repository_commit: Repository Commit in which the module should be accessed
    :param str repository_connector: Repository Connector is the reference to the connector for the repository
    :param str repository_path: Repository Path is the path in which the module resides
    :param str repository_url: URL where the module is stored
    :param int synced: Timestamp when the module was last synced
    :param str system: Provider of the module
    :param str tags: Tags associated with the module
    """
    __args__ = dict()
    __args__['created'] = created
    __args__['description'] = description
    __args__['id'] = id
    __args__['name'] = name
    __args__['repository'] = repository
    __args__['repositoryBranch'] = repository_branch
    __args__['repositoryCommit'] = repository_commit
    __args__['repositoryConnector'] = repository_connector
    __args__['repositoryPath'] = repository_path
    __args__['repositoryUrl'] = repository_url
    __args__['synced'] = synced
    __args__['system'] = system
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getInfraModule:getInfraModule', __args__, opts=opts, typ=GetInfraModuleResult)
    return __ret__.apply(lambda __response__: GetInfraModuleResult(
        created=pulumi.get(__response__, 'created'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        repository=pulumi.get(__response__, 'repository'),
        repository_branch=pulumi.get(__response__, 'repository_branch'),
        repository_commit=pulumi.get(__response__, 'repository_commit'),
        repository_connector=pulumi.get(__response__, 'repository_connector'),
        repository_path=pulumi.get(__response__, 'repository_path'),
        repository_url=pulumi.get(__response__, 'repository_url'),
        synced=pulumi.get(__response__, 'synced'),
        system=pulumi.get(__response__, 'system'),
        tags=pulumi.get(__response__, 'tags')))
