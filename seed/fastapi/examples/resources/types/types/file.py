# This file was auto-generated by Fern from our API Definition.

from ....core.pydantic_utilities import UniversalBaseModel
from ....core.pydantic_utilities import IS_PYDANTIC_V2
import typing
import pydantic
class File(UniversalBaseModel):
    """
    Examples
    --------
    from seed.examples.resources.types import File
    
    File(
        name="file.txt",
        contents="...",
    )
    """
    name: str
    contents: str
    
    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:
        class Config:
            extra = pydantic.Extra.forbid
