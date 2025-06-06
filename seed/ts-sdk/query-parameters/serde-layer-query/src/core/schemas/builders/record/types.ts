import { BaseSchema } from "../../Schema.js";
import { SchemaUtils } from "../schema-utils/index.js";

export type RecordSchema<
    RawKey extends string | number,
    RawValue,
    ParsedKey extends string | number,
    ParsedValue,
> = BaseRecordSchema<RawKey, RawValue, ParsedKey, ParsedValue> &
    SchemaUtils<Record<RawKey, RawValue>, Record<ParsedKey, ParsedValue>>;

export type BaseRecordSchema<
    RawKey extends string | number,
    RawValue,
    ParsedKey extends string | number,
    ParsedValue,
> = BaseSchema<Record<RawKey, RawValue>, Record<ParsedKey, ParsedValue>>;
