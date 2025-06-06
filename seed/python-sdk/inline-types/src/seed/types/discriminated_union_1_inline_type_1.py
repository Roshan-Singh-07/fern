# This file was auto-generated by Fern from our API Definition.

from ..core.pydantic_utilities import UniversalBaseModel
import pydantic
from .discriminated_union_1_inline_type_1_inline_type_1 import DiscriminatedUnion1InlineType1InlineType1
from .reference_type import ReferenceType
from ..core.pydantic_utilities import IS_PYDANTIC_V2
import typing


class DiscriminatedUnion1InlineType1(UniversalBaseModel):
    """
    lorem ipsum
    """

    foo: str = pydantic.Field()
    """
    lorem ipsum
    """

    bar: DiscriminatedUnion1InlineType1InlineType1 = pydantic.Field()
    """
    lorem ipsum
    """

    ref: ReferenceType = pydantic.Field()
    """
    lorem ipsum
    """

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow
