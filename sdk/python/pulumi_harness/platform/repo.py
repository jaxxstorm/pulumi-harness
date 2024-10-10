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

__all__ = ['RepoArgs', 'Repo']

@pulumi.input_type
class RepoArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 default_branch: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 git_ignore: Optional[pulumi.Input[str]] = None,
                 license: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 readme: Optional[pulumi.Input[bool]] = None,
                 sources: Optional[pulumi.Input[Sequence[pulumi.Input['RepoSourceArgs']]]] = None):
        """
        The set of arguments for constructing a Repo resource.
        :param pulumi.Input[str] identifier: Identifier of the repository.
        :param pulumi.Input[str] default_branch: Default branch of the repository (Applicate only for create).
        :param pulumi.Input[str] description: Description of the repository.
        :param pulumi.Input[str] git_ignore: Repository should be created with specified predefined gitignore file.
        :param pulumi.Input[str] license: Repository should be created with specified predefined license file.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[bool] readme: Repository should be created with readme file.
        :param pulumi.Input[Sequence[pulumi.Input['RepoSourceArgs']]] sources: Configuration for importing an existing repository from SCM provider.
        """
        pulumi.set(__self__, "identifier", identifier)
        if default_branch is not None:
            pulumi.set(__self__, "default_branch", default_branch)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if git_ignore is not None:
            pulumi.set(__self__, "git_ignore", git_ignore)
        if license is not None:
            pulumi.set(__self__, "license", license)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if readme is not None:
            pulumi.set(__self__, "readme", readme)
        if sources is not None:
            pulumi.set(__self__, "sources", sources)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        Identifier of the repository.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="defaultBranch")
    def default_branch(self) -> Optional[pulumi.Input[str]]:
        """
        Default branch of the repository (Applicate only for create).
        """
        return pulumi.get(self, "default_branch")

    @default_branch.setter
    def default_branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_branch", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the repository.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="gitIgnore")
    def git_ignore(self) -> Optional[pulumi.Input[str]]:
        """
        Repository should be created with specified predefined gitignore file.
        """
        return pulumi.get(self, "git_ignore")

    @git_ignore.setter
    def git_ignore(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_ignore", value)

    @property
    @pulumi.getter
    def license(self) -> Optional[pulumi.Input[str]]:
        """
        Repository should be created with specified predefined license file.
        """
        return pulumi.get(self, "license")

    @license.setter
    def license(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "license", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def readme(self) -> Optional[pulumi.Input[bool]]:
        """
        Repository should be created with readme file.
        """
        return pulumi.get(self, "readme")

    @readme.setter
    def readme(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "readme", value)

    @property
    @pulumi.getter
    def sources(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RepoSourceArgs']]]]:
        """
        Configuration for importing an existing repository from SCM provider.
        """
        return pulumi.get(self, "sources")

    @sources.setter
    def sources(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RepoSourceArgs']]]]):
        pulumi.set(self, "sources", value)


@pulumi.input_type
class _RepoState:
    def __init__(__self__, *,
                 created: Optional[pulumi.Input[int]] = None,
                 created_by: Optional[pulumi.Input[int]] = None,
                 default_branch: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 git_ignore: Optional[pulumi.Input[str]] = None,
                 git_url: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 license: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 readme: Optional[pulumi.Input[bool]] = None,
                 sources: Optional[pulumi.Input[Sequence[pulumi.Input['RepoSourceArgs']]]] = None,
                 updated: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Repo resources.
        :param pulumi.Input[int] created: Timestamp when the repository was created.
        :param pulumi.Input[int] created_by: ID of the user who created the repository.
        :param pulumi.Input[str] default_branch: Default branch of the repository (Applicate only for create).
        :param pulumi.Input[str] description: Description of the repository.
        :param pulumi.Input[str] git_ignore: Repository should be created with specified predefined gitignore file.
        :param pulumi.Input[str] git_url: Git URL of the repository.
        :param pulumi.Input[str] identifier: Identifier of the repository.
        :param pulumi.Input[str] license: Repository should be created with specified predefined license file.
        :param pulumi.Input[str] name: Name of the repository.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] path: Path of the repository.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[bool] readme: Repository should be created with readme file.
        :param pulumi.Input[Sequence[pulumi.Input['RepoSourceArgs']]] sources: Configuration for importing an existing repository from SCM provider.
        :param pulumi.Input[int] updated: Timestamp when the repository was last updated.
        """
        if created is not None:
            pulumi.set(__self__, "created", created)
        if created_by is not None:
            pulumi.set(__self__, "created_by", created_by)
        if default_branch is not None:
            pulumi.set(__self__, "default_branch", default_branch)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if git_ignore is not None:
            pulumi.set(__self__, "git_ignore", git_ignore)
        if git_url is not None:
            pulumi.set(__self__, "git_url", git_url)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if license is not None:
            pulumi.set(__self__, "license", license)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if readme is not None:
            pulumi.set(__self__, "readme", readme)
        if sources is not None:
            pulumi.set(__self__, "sources", sources)
        if updated is not None:
            pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[int]]:
        """
        Timestamp when the repository was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the user who created the repository.
        """
        return pulumi.get(self, "created_by")

    @created_by.setter
    def created_by(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "created_by", value)

    @property
    @pulumi.getter(name="defaultBranch")
    def default_branch(self) -> Optional[pulumi.Input[str]]:
        """
        Default branch of the repository (Applicate only for create).
        """
        return pulumi.get(self, "default_branch")

    @default_branch.setter
    def default_branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_branch", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the repository.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="gitIgnore")
    def git_ignore(self) -> Optional[pulumi.Input[str]]:
        """
        Repository should be created with specified predefined gitignore file.
        """
        return pulumi.get(self, "git_ignore")

    @git_ignore.setter
    def git_ignore(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_ignore", value)

    @property
    @pulumi.getter(name="gitUrl")
    def git_url(self) -> Optional[pulumi.Input[str]]:
        """
        Git URL of the repository.
        """
        return pulumi.get(self, "git_url")

    @git_url.setter
    def git_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "git_url", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the repository.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def license(self) -> Optional[pulumi.Input[str]]:
        """
        Repository should be created with specified predefined license file.
        """
        return pulumi.get(self, "license")

    @license.setter
    def license(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "license", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the repository.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        Path of the repository.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def readme(self) -> Optional[pulumi.Input[bool]]:
        """
        Repository should be created with readme file.
        """
        return pulumi.get(self, "readme")

    @readme.setter
    def readme(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "readme", value)

    @property
    @pulumi.getter
    def sources(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RepoSourceArgs']]]]:
        """
        Configuration for importing an existing repository from SCM provider.
        """
        return pulumi.get(self, "sources")

    @sources.setter
    def sources(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RepoSourceArgs']]]]):
        pulumi.set(self, "sources", value)

    @property
    @pulumi.getter
    def updated(self) -> Optional[pulumi.Input[int]]:
        """
        Timestamp when the repository was last updated.
        """
        return pulumi.get(self, "updated")

    @updated.setter
    def updated(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "updated", value)


class Repo(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_branch: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 git_ignore: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 license: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 readme: Optional[pulumi.Input[bool]] = None,
                 sources: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RepoSourceArgs', 'RepoSourceArgsDict']]]]] = None,
                 __props__=None):
        """
        Resource for creating a Harness Repo.

        ## Import

        Import

        ```sh
        $ pulumi import harness:platform/repo:Repo example <identifier>
        ```

        Import using the organization id

        ```sh
        $ pulumi import harness:platform/repo:Repo example <org_id>/<identifier>
        ```

        Import using the organization id and the project id

        ```sh
        $ pulumi import harness:platform/repo:Repo example <org_id>/<project_id>/<identifier>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] default_branch: Default branch of the repository (Applicate only for create).
        :param pulumi.Input[str] description: Description of the repository.
        :param pulumi.Input[str] git_ignore: Repository should be created with specified predefined gitignore file.
        :param pulumi.Input[str] identifier: Identifier of the repository.
        :param pulumi.Input[str] license: Repository should be created with specified predefined license file.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[bool] readme: Repository should be created with readme file.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RepoSourceArgs', 'RepoSourceArgsDict']]]] sources: Configuration for importing an existing repository from SCM provider.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RepoArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a Harness Repo.

        ## Import

        Import

        ```sh
        $ pulumi import harness:platform/repo:Repo example <identifier>
        ```

        Import using the organization id

        ```sh
        $ pulumi import harness:platform/repo:Repo example <org_id>/<identifier>
        ```

        Import using the organization id and the project id

        ```sh
        $ pulumi import harness:platform/repo:Repo example <org_id>/<project_id>/<identifier>
        ```

        :param str resource_name: The name of the resource.
        :param RepoArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RepoArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_branch: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 git_ignore: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 license: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 readme: Optional[pulumi.Input[bool]] = None,
                 sources: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RepoSourceArgs', 'RepoSourceArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RepoArgs.__new__(RepoArgs)

            __props__.__dict__["default_branch"] = default_branch
            __props__.__dict__["description"] = description
            __props__.__dict__["git_ignore"] = git_ignore
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["license"] = license
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["readme"] = readme
            __props__.__dict__["sources"] = sources
            __props__.__dict__["created"] = None
            __props__.__dict__["created_by"] = None
            __props__.__dict__["git_url"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["path"] = None
            __props__.__dict__["updated"] = None
        super(Repo, __self__).__init__(
            'harness:platform/repo:Repo',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created: Optional[pulumi.Input[int]] = None,
            created_by: Optional[pulumi.Input[int]] = None,
            default_branch: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            git_ignore: Optional[pulumi.Input[str]] = None,
            git_url: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            license: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            readme: Optional[pulumi.Input[bool]] = None,
            sources: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RepoSourceArgs', 'RepoSourceArgsDict']]]]] = None,
            updated: Optional[pulumi.Input[int]] = None) -> 'Repo':
        """
        Get an existing Repo resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] created: Timestamp when the repository was created.
        :param pulumi.Input[int] created_by: ID of the user who created the repository.
        :param pulumi.Input[str] default_branch: Default branch of the repository (Applicate only for create).
        :param pulumi.Input[str] description: Description of the repository.
        :param pulumi.Input[str] git_ignore: Repository should be created with specified predefined gitignore file.
        :param pulumi.Input[str] git_url: Git URL of the repository.
        :param pulumi.Input[str] identifier: Identifier of the repository.
        :param pulumi.Input[str] license: Repository should be created with specified predefined license file.
        :param pulumi.Input[str] name: Name of the repository.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] path: Path of the repository.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[bool] readme: Repository should be created with readme file.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RepoSourceArgs', 'RepoSourceArgsDict']]]] sources: Configuration for importing an existing repository from SCM provider.
        :param pulumi.Input[int] updated: Timestamp when the repository was last updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RepoState.__new__(_RepoState)

        __props__.__dict__["created"] = created
        __props__.__dict__["created_by"] = created_by
        __props__.__dict__["default_branch"] = default_branch
        __props__.__dict__["description"] = description
        __props__.__dict__["git_ignore"] = git_ignore
        __props__.__dict__["git_url"] = git_url
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["license"] = license
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["path"] = path
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["readme"] = readme
        __props__.__dict__["sources"] = sources
        __props__.__dict__["updated"] = updated
        return Repo(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[int]:
        """
        Timestamp when the repository was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> pulumi.Output[int]:
        """
        ID of the user who created the repository.
        """
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter(name="defaultBranch")
    def default_branch(self) -> pulumi.Output[Optional[str]]:
        """
        Default branch of the repository (Applicate only for create).
        """
        return pulumi.get(self, "default_branch")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the repository.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="gitIgnore")
    def git_ignore(self) -> pulumi.Output[Optional[str]]:
        """
        Repository should be created with specified predefined gitignore file.
        """
        return pulumi.get(self, "git_ignore")

    @property
    @pulumi.getter(name="gitUrl")
    def git_url(self) -> pulumi.Output[str]:
        """
        Git URL of the repository.
        """
        return pulumi.get(self, "git_url")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Identifier of the repository.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def license(self) -> pulumi.Output[Optional[str]]:
        """
        Repository should be created with specified predefined license file.
        """
        return pulumi.get(self, "license")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the repository.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[str]:
        """
        Path of the repository.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def readme(self) -> pulumi.Output[Optional[bool]]:
        """
        Repository should be created with readme file.
        """
        return pulumi.get(self, "readme")

    @property
    @pulumi.getter
    def sources(self) -> pulumi.Output[Optional[Sequence['outputs.RepoSource']]]:
        """
        Configuration for importing an existing repository from SCM provider.
        """
        return pulumi.get(self, "sources")

    @property
    @pulumi.getter
    def updated(self) -> pulumi.Output[int]:
        """
        Timestamp when the repository was last updated.
        """
        return pulumi.get(self, "updated")

