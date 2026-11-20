# Mace

A Fabric 1.20.1 mod that adds the mace: a heavy weapon whose smash attack hits harder the
further you fall.

## What it does

- Deals 5 base attack damage, with a heavy swing speed penalty.
- **Smash attack**: hitting something while falling more than 1.5 blocks adds bonus damage that
  scales with the fall distance (about 4x per block up to three blocks, then slower growth).
- Takes 1 durability per hit and 2 per block mined, and repairs with iron ingots.

## Building

Requires Java 17. The Gradle wrapper is included:

```
./gradlew build
```

The jar lands in `build/libs/`. Drop it and [Fabric API](https://modrinth.com/mod/fabric-api)
into your `mods` folder.

## Note on newer Minecraft versions

The item's attribute block uses `getAttributeModifiers`, `GENERIC_ATTACK_DAMAGE` and
`ATTACK_DAMAGE_MODIFIER_ID`. Those were removed in 1.21, where items declare attributes through
an `AttributeModifiersComponent` instead. Porting this mod past 1.20.1 means rewriting that part.

## Licence

MIT, see `LICENSE`.
