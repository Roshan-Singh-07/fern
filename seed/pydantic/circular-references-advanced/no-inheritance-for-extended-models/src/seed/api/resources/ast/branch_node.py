# This file was auto-generated by Fern from our API Definition.

from __future__ import annotations

import typing

import pydantic
from ...core.pydantic_utilities import IS_PYDANTIC_V2, UniversalBaseModel, update_forward_refs


class BranchNode(UniversalBaseModel):
    children: typing.List["Node"]

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow")  # type: ignore # Pydantic v2
    else:

        class Config:
            extra = pydantic.Extra.allow


from .node import Node  # noqa: E402, F401, I001

update_forward_refs(BranchNode)
