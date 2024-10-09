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

accountId: Optional[str]
"""
The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
"""

apiKey: Optional[str]
"""
The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
"""

endpoint: Optional[str]
"""
The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
`HARNESS_ENDPOINT` environment variable.
"""

platformApiKey: Optional[str]
"""
The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
variable. For more information to create an API key in NextGen, see
https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
"""

