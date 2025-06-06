# This file was auto-generated by Fern from our API Definition.

from ....core.pydantic_utilities import UniversalBaseModel
import pydantic
import typing
from .next_page import NextPage
from ....core.pydantic_utilities import IS_PYDANTIC_V2
class Page(UniversalBaseModel):
    page: int = pydantic.Field()
    """
    The current page
    """
    
    next: typing.Optional[NextPage] = None
    per_page: int
    total_page: int
    
    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:
        class Config:
            extra = pydantic.Extra.forbid
