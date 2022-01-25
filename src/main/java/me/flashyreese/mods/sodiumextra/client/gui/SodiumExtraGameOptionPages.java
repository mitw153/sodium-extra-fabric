package me.flashyreese.mods.sodiumextra.client.gui;

import com.google.common.collect.ImmutableList;
import me.flashyreese.mods.sodiumextra.client.gui.options.storage.SodiumExtraOptionsStorage;
import me.jellysquid.mods.sodium.client.gui.options.*;
import me.jellysquid.mods.sodium.client.gui.options.control.ControlValueFormatter;
import me.jellysquid.mods.sodium.client.gui.options.control.SliderControl;
import me.jellysquid.mods.sodium.client.gui.options.control.TickBoxControl;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.TranslatableText;

import java.util.ArrayList;
import java.util.List;

public class SodiumExtraGameOptionPages {
    public static final SodiumExtraOptionsStorage sodiumExtraOpts = new SodiumExtraOptionsStorage();

    public static OptionPage animation() {
        List<OptionGroup> groups = new ArrayList<>();
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.animations_all").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.animations_all.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.animationSettings.animation = value, opts -> opts.animationSettings.animation)
                        .build()
                )
                .build());

        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.animate_water").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.animate_water.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.animationSettings.animateWater = value, opts -> opts.animationSettings.animateWater)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.animate_lava").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.animate_lava.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.animationSettings.animateLava = value, opts -> opts.animationSettings.animateLava)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.animate_fire").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.animate_fire.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.animationSettings.animateFire = value, opts -> opts.animationSettings.animateFire)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.animate_portal").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.animate_portal.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.animationSettings.animatePortal = value, opts -> opts.animationSettings.animatePortal)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.block_animations").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.block_animations.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.animationSettings.blockAnimations = value, options -> options.animationSettings.blockAnimations)
                        .build()
                )
                .build());
        return new OptionPage(new TranslatableText("sodium-extra.option.animations").getString(), ImmutableList.copyOf(groups));
    }

    public static OptionPage particle() {
        List<OptionGroup> groups = new ArrayList<>();
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.particles_all").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.particles_all.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.particles = value, opts -> opts.particleSettings.particles)
                        .build()
                )
                .build());

        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.rain_splash").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.rain_splash.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.rainSplash = value, opts -> opts.particleSettings.rainSplash)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.explosions").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.explosions.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.explosion = value, opts -> opts.particleSettings.explosion)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.water").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.water.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.water = value, opts -> opts.particleSettings.water)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.smoke").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.smoke.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.smoke = value, opts -> opts.particleSettings.smoke)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.potions").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.potions.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.potion = value, opts -> opts.particleSettings.potion)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.portal").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.portal.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.portal = value, opts -> opts.particleSettings.portal)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.redstone").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.redstone.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.redstone = value, opts -> opts.particleSettings.redstone)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.dripping_particles").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.dripping_particles.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.drip = value, opts -> opts.particleSettings.drip)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.fireworks").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.fireworks.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.firework = value, opts -> opts.particleSettings.firework)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.bubbles").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.bubbles.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.bubble = value, opts -> opts.particleSettings.bubble)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.environment").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.environment.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.environment = value, opts -> opts.particleSettings.environment)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.villagers").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.villagers.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.villagers = value, opts -> opts.particleSettings.villagers)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.composter").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.composter.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.composter = value, opts -> opts.particleSettings.composter)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.block_break").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.block_break.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.blockBreak = value, opts -> opts.particleSettings.blockBreak)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.block_breaking").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.block_breaking.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.blockBreaking = value, opts -> opts.particleSettings.blockBreaking)
                        .build()
                )
                .build());
        return new OptionPage(new TranslatableText("sodium-extra.option.particles").getString(), ImmutableList.copyOf(groups));
    }

    public static OptionPage detail() {
        List<OptionGroup> groups = new ArrayList<>();
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.rain&snow").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.rain&snow.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.detailSettings.rainSnow = value, opts -> opts.detailSettings.rainSnow)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.biome_colors").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.biome_colors.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.detailSettings.biomeColors = value, options -> options.detailSettings.biomeColors)
                        .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.sky_colors").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.sky_colors.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.detailSettings.skyColors = value, options -> options.detailSettings.skyColors)
                        .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                        .build()
                )
                .build());
        return new OptionPage(new TranslatableText("sodium-extra.option.details").getString(), ImmutableList.copyOf(groups));
    }

    public static OptionPage render() {
        List<OptionGroup> groups = new ArrayList<>();
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.fog").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.fog.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.renderSettings.fog = value, options -> options.renderSettings.fog)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.light_updates").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.light_updates.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.renderSettings.lightUpdates = value, options -> options.renderSettings.lightUpdates)
                        .build()
                )
                .build());
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.item_frames").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.item_frames.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.renderSettings.itemFrame = value, opts -> opts.renderSettings.itemFrame)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.armor_stands").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.armor_stands.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.renderSettings.armorStand = value, options -> options.renderSettings.armorStand)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.paintings").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.paintings.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.renderSettings.painting = value, options -> options.renderSettings.painting)
                        .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.piston").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.piston.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.renderSettings.piston = value, options -> options.renderSettings.piston)
                        .build()
                )
                .build());
        return new OptionPage(new TranslatableText("sodium-extra.option.render").getString(), ImmutableList.copyOf(groups));
    }

    public static OptionPage extra() {
        List<OptionGroup> groups = new ArrayList<>();
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, SodiumExtraGameOptionPages.sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.use_fast_random").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.use_fast_random.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.useFastRandom = value, options -> options.extraSettings.useFastRandom)
                        .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Reduce Resolution on macOS")
                        .setTooltip("Use half the resolution on retina displays, vastly improving performance on macOS.\nModifying this option will require a game restart.")
                        .setEnabled(MinecraftClient.IS_SYSTEM_MAC)
                        .setImpact(OptionImpact.HIGH)
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.extraSettings.reduceResolutionOnMac = value, opts -> opts.extraSettings.reduceResolutionOnMac)
                        .build()
                ).build());
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.show_fps").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.show_fps.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.extraSettings.showFps = value, opts -> opts.extraSettings.showFps)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.show_coordinates").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.show_coordinates.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.extraSettings.showCoords = value, opts -> opts.extraSettings.showCoords)
                        .build()
                )
                .add(OptionImpl.createBuilder(int.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.cloud_height").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.cloud_height.tooltip").getString())
                        .setControl(option -> new SliderControl(option, 0, 255, 1, ControlValueFormatter.number()))
                        .setBinding((options, value) -> options.extraSettings.cloudHeight = value, options -> options.extraSettings.cloudHeight)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.toasts").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.toasts.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.toasts = value, options -> options.extraSettings.toasts)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.instant_sneak").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.instant_sneak.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.instantSneak = value, options -> options.extraSettings.instantSneak)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName(new TranslatableText("sodium-extra.option.prevent_shaders").getString())
                        .setTooltip(new TranslatableText("sodium-extra.option.prevent_shaders.tooltip").getString())
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.preventShaders = value, options -> options.extraSettings.preventShaders)
                        .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                        .build()
                )
                .build());

        return new OptionPage(new TranslatableText("sodium-extra.option.extras").getString(), ImmutableList.copyOf(groups));
    }
}
