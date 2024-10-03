# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['FileStoreFolderArgs', 'FileStoreFolder']

@pulumi.input_type
class FileStoreFolderArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 parent_identifier: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a FileStoreFolder resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] parent_identifier: Folder parent identifier on Harness File Store. If the file is at the root level, the parent_identifier will be `Root`.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "parent_identifier", parent_identifier)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="parentIdentifier")
    def parent_identifier(self) -> pulumi.Input[str]:
        """
        Folder parent identifier on Harness File Store. If the file is at the root level, the parent_identifier will be `Root`.
        """
        return pulumi.get(self, "parent_identifier")

    @parent_identifier.setter
    def parent_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "parent_identifier", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource.
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
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _FileStoreFolderState:
    def __init__(__self__, *,
                 created_bies: Optional[pulumi.Input[Sequence[pulumi.Input['FileStoreFolderCreatedByArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 last_modified_at: Optional[pulumi.Input[int]] = None,
                 last_modified_bies: Optional[pulumi.Input[Sequence[pulumi.Input['FileStoreFolderLastModifiedByArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 parent_identifier: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering FileStoreFolder resources.
        :param pulumi.Input[Sequence[pulumi.Input['FileStoreFolderCreatedByArgs']]] created_bies: Created by
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[int] last_modified_at: Last modified at
        :param pulumi.Input[Sequence[pulumi.Input['FileStoreFolderLastModifiedByArgs']]] last_modified_bies: Last modified by
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] parent_identifier: Folder parent identifier on Harness File Store. If the file is at the root level, the parent_identifier will be `Root`.
        :param pulumi.Input[str] path: Harness File Store folder path
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        if created_bies is not None:
            pulumi.set(__self__, "created_bies", created_bies)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if last_modified_at is not None:
            pulumi.set(__self__, "last_modified_at", last_modified_at)
        if last_modified_bies is not None:
            pulumi.set(__self__, "last_modified_bies", last_modified_bies)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if parent_identifier is not None:
            pulumi.set(__self__, "parent_identifier", parent_identifier)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="createdBies")
    def created_bies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FileStoreFolderCreatedByArgs']]]]:
        """
        Created by
        """
        return pulumi.get(self, "created_bies")

    @created_bies.setter
    def created_bies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FileStoreFolderCreatedByArgs']]]]):
        pulumi.set(self, "created_bies", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="lastModifiedAt")
    def last_modified_at(self) -> Optional[pulumi.Input[int]]:
        """
        Last modified at
        """
        return pulumi.get(self, "last_modified_at")

    @last_modified_at.setter
    def last_modified_at(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "last_modified_at", value)

    @property
    @pulumi.getter(name="lastModifiedBies")
    def last_modified_bies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FileStoreFolderLastModifiedByArgs']]]]:
        """
        Last modified by
        """
        return pulumi.get(self, "last_modified_bies")

    @last_modified_bies.setter
    def last_modified_bies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FileStoreFolderLastModifiedByArgs']]]]):
        pulumi.set(self, "last_modified_bies", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource.
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
    @pulumi.getter(name="parentIdentifier")
    def parent_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Folder parent identifier on Harness File Store. If the file is at the root level, the parent_identifier will be `Root`.
        """
        return pulumi.get(self, "parent_identifier")

    @parent_identifier.setter
    def parent_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_identifier", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        Harness File Store folder path
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
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class FileStoreFolder(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 parent_identifier: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for creating folders in Harness.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        # Create folder
        example = harness.platform.FileStoreFolder("example",
            org_id="org_id",
            project_id="project_id",
            identifier="identifier",
            name="name",
            description="description",
            tags=[
                "foo:bar",
                "baz:qux",
            ],
            parent_identifier="parent_identifier")
        ```

        ## Import

        Import account level folder

        ```sh
        $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example <identifier>
        ```

        Import org level folder

        ```sh
        $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example <org_id><identifier>
        ```

        Import org level folder

        ```sh
        $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example <org_id><project_id><identifier>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] parent_identifier: Folder parent identifier on Harness File Store. If the file is at the root level, the parent_identifier will be `Root`.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FileStoreFolderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating folders in Harness.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_harness as harness

        # Create folder
        example = harness.platform.FileStoreFolder("example",
            org_id="org_id",
            project_id="project_id",
            identifier="identifier",
            name="name",
            description="description",
            tags=[
                "foo:bar",
                "baz:qux",
            ],
            parent_identifier="parent_identifier")
        ```

        ## Import

        Import account level folder

        ```sh
        $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example <identifier>
        ```

        Import org level folder

        ```sh
        $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example <org_id><identifier>
        ```

        Import org level folder

        ```sh
        $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example <org_id><project_id><identifier>
        ```

        :param str resource_name: The name of the resource.
        :param FileStoreFolderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FileStoreFolderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 parent_identifier: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FileStoreFolderArgs.__new__(FileStoreFolderArgs)

            __props__.__dict__["description"] = description
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            if parent_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'parent_identifier'")
            __props__.__dict__["parent_identifier"] = parent_identifier
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["created_bies"] = None
            __props__.__dict__["last_modified_at"] = None
            __props__.__dict__["last_modified_bies"] = None
            __props__.__dict__["path"] = None
        super(FileStoreFolder, __self__).__init__(
            'harness:platform/fileStoreFolder:FileStoreFolder',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_bies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FileStoreFolderCreatedByArgs', 'FileStoreFolderCreatedByArgsDict']]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            last_modified_at: Optional[pulumi.Input[int]] = None,
            last_modified_bies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FileStoreFolderLastModifiedByArgs', 'FileStoreFolderLastModifiedByArgsDict']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            parent_identifier: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'FileStoreFolder':
        """
        Get an existing FileStoreFolder resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['FileStoreFolderCreatedByArgs', 'FileStoreFolderCreatedByArgsDict']]]] created_bies: Created by
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[int] last_modified_at: Last modified at
        :param pulumi.Input[Sequence[pulumi.Input[Union['FileStoreFolderLastModifiedByArgs', 'FileStoreFolderLastModifiedByArgsDict']]]] last_modified_bies: Last modified by
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] parent_identifier: Folder parent identifier on Harness File Store. If the file is at the root level, the parent_identifier will be `Root`.
        :param pulumi.Input[str] path: Harness File Store folder path
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FileStoreFolderState.__new__(_FileStoreFolderState)

        __props__.__dict__["created_bies"] = created_bies
        __props__.__dict__["description"] = description
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["last_modified_at"] = last_modified_at
        __props__.__dict__["last_modified_bies"] = last_modified_bies
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["parent_identifier"] = parent_identifier
        __props__.__dict__["path"] = path
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["tags"] = tags
        return FileStoreFolder(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdBies")
    def created_bies(self) -> pulumi.Output[Sequence['outputs.FileStoreFolderCreatedBy']]:
        """
        Created by
        """
        return pulumi.get(self, "created_bies")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="lastModifiedAt")
    def last_modified_at(self) -> pulumi.Output[int]:
        """
        Last modified at
        """
        return pulumi.get(self, "last_modified_at")

    @property
    @pulumi.getter(name="lastModifiedBies")
    def last_modified_bies(self) -> pulumi.Output[Sequence['outputs.FileStoreFolderLastModifiedBy']]:
        """
        Last modified by
        """
        return pulumi.get(self, "last_modified_bies")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the resource.
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
    @pulumi.getter(name="parentIdentifier")
    def parent_identifier(self) -> pulumi.Output[str]:
        """
        Folder parent identifier on Harness File Store. If the file is at the root level, the parent_identifier will be `Root`.
        """
        return pulumi.get(self, "parent_identifier")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[str]:
        """
        Harness File Store folder path
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
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to associate with the resource.
        """
        return pulumi.get(self, "tags")

