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

__all__ = [
    'GetRepoResult',
    'AwaitableGetRepoResult',
    'get_repo',
    'get_repo_output',
]

@pulumi.output_type
class GetRepoResult:
    """
    A collection of values returned by getRepo.
    """
    def __init__(__self__, created=None, created_by=None, default_branch=None, description=None, git_ignore=None, git_url=None, id=None, identifier=None, license=None, name=None, org_id=None, path=None, project_id=None, readme=None, sources=None, updated=None):
        if created and not isinstance(created, int):
            raise TypeError("Expected argument 'created' to be a int")
        pulumi.set(__self__, "created", created)
        if created_by and not isinstance(created_by, int):
            raise TypeError("Expected argument 'created_by' to be a int")
        pulumi.set(__self__, "created_by", created_by)
        if default_branch and not isinstance(default_branch, str):
            raise TypeError("Expected argument 'default_branch' to be a str")
        pulumi.set(__self__, "default_branch", default_branch)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if git_ignore and not isinstance(git_ignore, str):
            raise TypeError("Expected argument 'git_ignore' to be a str")
        pulumi.set(__self__, "git_ignore", git_ignore)
        if git_url and not isinstance(git_url, str):
            raise TypeError("Expected argument 'git_url' to be a str")
        pulumi.set(__self__, "git_url", git_url)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if license and not isinstance(license, str):
            raise TypeError("Expected argument 'license' to be a str")
        pulumi.set(__self__, "license", license)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if readme and not isinstance(readme, bool):
            raise TypeError("Expected argument 'readme' to be a bool")
        pulumi.set(__self__, "readme", readme)
        if sources and not isinstance(sources, list):
            raise TypeError("Expected argument 'sources' to be a list")
        pulumi.set(__self__, "sources", sources)
        if updated and not isinstance(updated, int):
            raise TypeError("Expected argument 'updated' to be a int")
        pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter
    def created(self) -> int:
        """
        Timestamp when the repository was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> int:
        """
        ID of the user who created the repository.
        """
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter(name="defaultBranch")
    def default_branch(self) -> Optional[str]:
        """
        Default branch of the repository (Applicate only for create).
        """
        return pulumi.get(self, "default_branch")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Description of the repository.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="gitIgnore")
    def git_ignore(self) -> Optional[str]:
        """
        Repository should be created with specified predefined gitignore file.
        """
        return pulumi.get(self, "git_ignore")

    @property
    @pulumi.getter(name="gitUrl")
    def git_url(self) -> str:
        """
        Git URL of the repository.
        """
        return pulumi.get(self, "git_url")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Internal ID of the repository.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> str:
        """
        Identifier of the repository.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def license(self) -> Optional[str]:
        """
        Repository should be created with specified predefined license file.
        """
        return pulumi.get(self, "license")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the repository.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        Path of the repository.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def readme(self) -> Optional[bool]:
        """
        Repository should be created with readme file.
        """
        return pulumi.get(self, "readme")

    @property
    @pulumi.getter
    def sources(self) -> Optional[Sequence['outputs.GetRepoSourceResult']]:
        """
        Configuration for importing an existing repository from SCM provider.
        """
        return pulumi.get(self, "sources")

    @property
    @pulumi.getter
    def updated(self) -> int:
        """
        Timestamp when the repository was last updated.
        """
        return pulumi.get(self, "updated")


class AwaitableGetRepoResult(GetRepoResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRepoResult(
            created=self.created,
            created_by=self.created_by,
            default_branch=self.default_branch,
            description=self.description,
            git_ignore=self.git_ignore,
            git_url=self.git_url,
            id=self.id,
            identifier=self.identifier,
            license=self.license,
            name=self.name,
            org_id=self.org_id,
            path=self.path,
            project_id=self.project_id,
            readme=self.readme,
            sources=self.sources,
            updated=self.updated)


def get_repo(default_branch: Optional[str] = None,
             description: Optional[str] = None,
             git_ignore: Optional[str] = None,
             identifier: Optional[str] = None,
             license: Optional[str] = None,
             org_id: Optional[str] = None,
             project_id: Optional[str] = None,
             readme: Optional[bool] = None,
             sources: Optional[Sequence[Union['GetRepoSourceArgs', 'GetRepoSourceArgsDict']]] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRepoResult:
    """
    Data source for retrieving a Harness repo.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example_by_identifier = harness.platform.get_repo(identifier="identifier",
        org_id="org_id",
        project_id="proj_id")
    ```


    :param str default_branch: Default branch of the repository (Applicate only for create).
    :param str description: Description of the repository.
    :param str git_ignore: Repository should be created with specified predefined gitignore file.
    :param str identifier: Identifier of the repository.
    :param str license: Repository should be created with specified predefined license file.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    :param bool readme: Repository should be created with readme file.
    :param Sequence[Union['GetRepoSourceArgs', 'GetRepoSourceArgsDict']] sources: Configuration for importing an existing repository from SCM provider.
    """
    __args__ = dict()
    __args__['defaultBranch'] = default_branch
    __args__['description'] = description
    __args__['gitIgnore'] = git_ignore
    __args__['identifier'] = identifier
    __args__['license'] = license
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['readme'] = readme
    __args__['sources'] = sources
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getRepo:getRepo', __args__, opts=opts, typ=GetRepoResult).value

    return AwaitableGetRepoResult(
        created=pulumi.get(__ret__, 'created'),
        created_by=pulumi.get(__ret__, 'created_by'),
        default_branch=pulumi.get(__ret__, 'default_branch'),
        description=pulumi.get(__ret__, 'description'),
        git_ignore=pulumi.get(__ret__, 'git_ignore'),
        git_url=pulumi.get(__ret__, 'git_url'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        license=pulumi.get(__ret__, 'license'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        path=pulumi.get(__ret__, 'path'),
        project_id=pulumi.get(__ret__, 'project_id'),
        readme=pulumi.get(__ret__, 'readme'),
        sources=pulumi.get(__ret__, 'sources'),
        updated=pulumi.get(__ret__, 'updated'))
def get_repo_output(default_branch: Optional[pulumi.Input[Optional[str]]] = None,
                    description: Optional[pulumi.Input[Optional[str]]] = None,
                    git_ignore: Optional[pulumi.Input[Optional[str]]] = None,
                    identifier: Optional[pulumi.Input[str]] = None,
                    license: Optional[pulumi.Input[Optional[str]]] = None,
                    org_id: Optional[pulumi.Input[Optional[str]]] = None,
                    project_id: Optional[pulumi.Input[Optional[str]]] = None,
                    readme: Optional[pulumi.Input[Optional[bool]]] = None,
                    sources: Optional[pulumi.Input[Optional[Sequence[Union['GetRepoSourceArgs', 'GetRepoSourceArgsDict']]]]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRepoResult]:
    """
    Data source for retrieving a Harness repo.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example_by_identifier = harness.platform.get_repo(identifier="identifier",
        org_id="org_id",
        project_id="proj_id")
    ```


    :param str default_branch: Default branch of the repository (Applicate only for create).
    :param str description: Description of the repository.
    :param str git_ignore: Repository should be created with specified predefined gitignore file.
    :param str identifier: Identifier of the repository.
    :param str license: Repository should be created with specified predefined license file.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    :param bool readme: Repository should be created with readme file.
    :param Sequence[Union['GetRepoSourceArgs', 'GetRepoSourceArgsDict']] sources: Configuration for importing an existing repository from SCM provider.
    """
    __args__ = dict()
    __args__['defaultBranch'] = default_branch
    __args__['description'] = description
    __args__['gitIgnore'] = git_ignore
    __args__['identifier'] = identifier
    __args__['license'] = license
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    __args__['readme'] = readme
    __args__['sources'] = sources
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('harness:platform/getRepo:getRepo', __args__, opts=opts, typ=GetRepoResult)
    return __ret__.apply(lambda __response__: GetRepoResult(
        created=pulumi.get(__response__, 'created'),
        created_by=pulumi.get(__response__, 'created_by'),
        default_branch=pulumi.get(__response__, 'default_branch'),
        description=pulumi.get(__response__, 'description'),
        git_ignore=pulumi.get(__response__, 'git_ignore'),
        git_url=pulumi.get(__response__, 'git_url'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        license=pulumi.get(__response__, 'license'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        path=pulumi.get(__response__, 'path'),
        project_id=pulumi.get(__response__, 'project_id'),
        readme=pulumi.get(__response__, 'readme'),
        sources=pulumi.get(__response__, 'sources'),
        updated=pulumi.get(__response__, 'updated')))
