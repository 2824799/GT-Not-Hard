package util;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.FluidStack;

import java.util.HashMap;
import java.util.Map;

public class SingularityFluidRecipes {
    public static final Map<String, Map<Integer, FluidStack>> VoidFliudRecipes = new HashMap<>();

    public static void addVoidFliudRecipes() {
        //T0 - Overworld - Ow
        Map<Integer,FluidStack> OverworldRecipes = new HashMap<>();
        OverworldRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        OverworldRecipes.put(1 , Materials.Caesium.getMolten(1000));
        OverworldRecipes.put(2 , Materials.Calcium.getMolten(1000));
        OverworldRecipes.put(3 , Materials.Chrome.getMolten(1000));
        OverworldRecipes.put(4 , Materials.Copper.getMolten(1000));
        OverworldRecipes.put(5 , Materials.Gold.getMolten(1000));
        OverworldRecipes.put(6 , Materials.Iron.getMolten(1000));
        OverworldRecipes.put(7 , Materials.Lithium.getMolten(1000));
        OverworldRecipes.put(8 , Materials.Magnesium.getMolten(1000));
        OverworldRecipes.put(9 , Materials.Manganese.getMolten(1000));
        OverworldRecipes.put(10, Materials.Nickel.getMolten(1000));
        OverworldRecipes.put(11, Materials.Niobium.getMolten(1000));
        OverworldRecipes.put(12, Materials.Potassium.getMolten(1000));
        OverworldRecipes.put(13, Materials.Redstone.getMolten(1000));
        OverworldRecipes.put(14, Materials.Silicon.getMolten(1000));
        OverworldRecipes.put(15, Materials.Tantalum.getMolten(1000));
        OverworldRecipes.put(16, Materials.Tin.getMolten(1000));
        OverworldRecipes.put(17, Materials.Vanadium.getMolten(1000));

        OverworldRecipes.put(18, Materials.Mercury.getFluid(1000));
        OverworldRecipes.put(19, Materials.Oil.getFluid(1000));
        OverworldRecipes.put(20, Materials.OilHeavy.getFluid(1000));
        OverworldRecipes.put(21, Materials.OilLight.getFluid(1000));
        OverworldRecipes.put(22, Materials.OilMedium.getFluid(1000));

        OverworldRecipes.put(23, Materials.Chlorine.getGas(1000));
        OverworldRecipes.put(24, Materials.Fluorine.getGas(1000));
        OverworldRecipes.put(25, Materials.Hydrogen.getGas(1000));
        OverworldRecipes.put(26, Materials.NatruralGas.getGas(1000));
        OverworldRecipes.put(27, Materials.Oxygen.getGas(1000));

        //T0 - Nether - Ne
        Map<Integer,FluidStack> NetherRecipes = new HashMap<>();
        NetherRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        NetherRecipes.put(1 , Materials.Antimony.getMolten(1000));
        NetherRecipes.put(2 , Materials.Barium.getMolten(1000));
        NetherRecipes.put(3 , Materials.Beryllium.getMolten(1000));
        NetherRecipes.put(4 , Materials.Calcium.getMolten(1000));
        NetherRecipes.put(5 , Materials.Chrome.getMolten(1000));
        NetherRecipes.put(6 , Materials.Copper.getMolten(1000));
        NetherRecipes.put(7 , Materials.Electrotine.getMolten(1000));
        NetherRecipes.put(8 , Materials.Iron.getMolten(1000));
        NetherRecipes.put(9 , Materials.Lead.getMolten(1000));
        NetherRecipes.put(10, Materials.Manganese.getMolten(1000));
        NetherRecipes.put(11, Materials.Molybdenum.getMolten(1000));
        NetherRecipes.put(12, Materials.Potassium.getMolten(1000));
        NetherRecipes.put(13, Materials.Silicon.getMolten(1000));
        NetherRecipes.put(14, Materials.Tantalum.getMolten(1000));
        NetherRecipes.put(15, Materials.Thorium.getMolten(1000));
        NetherRecipes.put(16, Materials.Zinc.getMolten(1000));

        NetherRecipes.put(17, Materials.Lava.getFluid(1000));
        NetherRecipes.put(18, Materials.Mercury.getFluid(1000));

        NetherRecipes.put(19, Materials.Hydrogen.getGas(1000));
        NetherRecipes.put(20, Materials.Nitrogen.getGas(1000));
        NetherRecipes.put(21, Materials.Oxygen.getGas(1000));

        //T0 - Twilight - TF
        Map<Integer,FluidStack> TwilightRecipes = new HashMap<>();
        TwilightRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        TwilightRecipes.put(1 , Materials.Arsenic.getMolten(1000));
        TwilightRecipes.put(2 , Materials.Calcium.getMolten(1000));
        TwilightRecipes.put(3 , Materials.Cobalt.getMolten(1000));
        TwilightRecipes.put(4 , Materials.Copper.getMolten(1000));
        TwilightRecipes.put(5 , Materials.Gold.getMolten(1000));
        TwilightRecipes.put(6 , Materials.Iron.getMolten(1000));
        TwilightRecipes.put(7 , Materials.Lead.getMolten(1000));
        TwilightRecipes.put(8 , Materials.Lithium.getMolten(1000));
        TwilightRecipes.put(9 , Materials.Magnesium.getMolten(1000));
        TwilightRecipes.put(10, Materials.Molybdenum.getMolten(1000));
        TwilightRecipes.put(11, Materials.Nickel.getMolten(1000));
        TwilightRecipes.put(12, Materials.Niobium.getMolten(1000));
        TwilightRecipes.put(13, Materials.Potassium.getMolten(1000));
        TwilightRecipes.put(14, Materials.Silicon.getMolten(1000));
        TwilightRecipes.put(15, Materials.Silver.getMolten(1000));
        TwilightRecipes.put(16, Materials.Tin.getMolten(1000));
        TwilightRecipes.put(17, Materials.Vanadium.getMolten(1000));

        TwilightRecipes.put(18, Materials.Mercury.getFluid(1000));

        TwilightRecipes.put(19, Materials.Chlorine.getGas(1000));
        TwilightRecipes.put(20, Materials.Fluorine.getGas(1000));
        TwilightRecipes.put(21, Materials.Hydrogen.getGas(1000));
        TwilightRecipes.put(22, Materials.Nitrogen.getGas(1000));
        TwilightRecipes.put(23, Materials.Oxygen.getGas(1000));

        //T0 - TheEnd - ED
        Map<Integer,FluidStack> TheEndRecipes = new HashMap<>();
        TheEndRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        TheEndRecipes.put(1 , Materials.Antimony.getMolten(1000));
        TheEndRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        TheEndRecipes.put(3 , Materials.Beryllium.getMolten(1000));
        TheEndRecipes.put(4 , Materials.Calcium.getMolten(1000));
        TheEndRecipes.put(5 , Materials.Cobalt.getMolten(1000));
        TheEndRecipes.put(6 , Materials.Copper.getMolten(1000));
        TheEndRecipes.put(7 , Materials.Gold.getMolten(1000));
        TheEndRecipes.put(8 , Materials.Iron.getMolten(1000));
        TheEndRecipes.put(9 , Materials.Lead.getMolten(1000));
        TheEndRecipes.put(10, Materials.Molybdenum.getMolten(1000));
        TheEndRecipes.put(11, Materials.Nickel.getMolten(1000));
        TheEndRecipes.put(12, Materials.Silicon.getMolten(1000));
        TheEndRecipes.put(13, Materials.Thorium.getMolten(1000));
        TheEndRecipes.put(14, Materials.Tin.getMolten(1000));
        TheEndRecipes.put(15, Materials.Vanadium.getMolten(1000));

        TheEndRecipes.put(16, Materials.Hydrogen.getGas(1000));
        TheEndRecipes.put(17, Materials.Oxygen.getGas(1000));

        //T0 - EndAsteroid - EA
        Map<Integer,FluidStack> EndAsteroidRecipes = new HashMap<>();
        EndAsteroidRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        EndAsteroidRecipes.put(1 , Materials.Antimony.getMolten(1000));
        EndAsteroidRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        EndAsteroidRecipes.put(3 , Materials.Beryllium.getMolten(1000));
        EndAsteroidRecipes.put(4 , Materials.Calcium.getMolten(1000));
        EndAsteroidRecipes.put(5 , Materials.Cobalt.getMolten(1000));
        EndAsteroidRecipes.put(6 , Materials.Copper.getMolten(1000));
        EndAsteroidRecipes.put(7 , Materials.Gold.getMolten(1000));
        EndAsteroidRecipes.put(8 , Materials.Iridium.getMolten(1000));
        EndAsteroidRecipes.put(9 , Materials.Iron.getMolten(1000));
        EndAsteroidRecipes.put(10, Materials.Lead.getMolten(1000));
        EndAsteroidRecipes.put(11, Materials.Lithium.getMolten(1000));
        EndAsteroidRecipes.put(12, Materials.Magnesium.getMolten(1000));
        EndAsteroidRecipes.put(13, Materials.Manganese.getMolten(1000));
        EndAsteroidRecipes.put(14, Materials.Molybdenum.getMolten(1000));
        EndAsteroidRecipes.put(15, Materials.Naquadah.getMolten(1000));
        EndAsteroidRecipes.put(16, Materials.NaquadahEnriched.getMolten(1000));
        EndAsteroidRecipes.put(17, Materials.Nickel.getMolten(1000));
        EndAsteroidRecipes.put(18, Materials.Palladium.getMolten(1000));
        EndAsteroidRecipes.put(19, Materials.Platinum.getMolten(1000));
        EndAsteroidRecipes.put(20, Materials.Potassium.getMolten(1000));
        EndAsteroidRecipes.put(21, Materials.Silicon.getMolten(1000));
        EndAsteroidRecipes.put(22, Materials.Tantalum.getMolten(1000));
        EndAsteroidRecipes.put(23, Materials.Thorium.getMolten(1000));
        EndAsteroidRecipes.put(24, Materials.Tin.getMolten(1000));
        EndAsteroidRecipes.put(25, Materials.Tungsten.getMolten(1000));
        EndAsteroidRecipes.put(26, Materials.Vanadium.getMolten(1000));

        EndAsteroidRecipes.put(27, Materials.Chlorine.getGas(1000));
        EndAsteroidRecipes.put(28, Materials.Fluorine.getGas(1000));
        EndAsteroidRecipes.put(29, Materials.Hydrogen.getGas(1000));
        EndAsteroidRecipes.put(30, Materials.Nitrogen.getGas(1000));
        EndAsteroidRecipes.put(31, Materials.Oxygen.getGas(1000));

        //T1 - Moon - Mo
        Map<Integer,FluidStack> MoonRecipes = new HashMap<>();
        MoonRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        MoonRecipes.put(1 , Materials.Barium.getMolten(1000));
        MoonRecipes.put(2 , Materials.Calcium.getMolten(1000));
        MoonRecipes.put(3 , Materials.Cerium.getMolten(1000));
        MoonRecipes.put(4 , Materials.Chrome.getMolten(1000));
        MoonRecipes.put(5 , Materials.Copper.getMolten(1000));
        MoonRecipes.put(6 , Materials.Gadolinium.getMolten(1000));
        MoonRecipes.put(7 , Materials.Gold.getMolten(1000));
        MoonRecipes.put(8 , Materials.Holmium.getMolten(1000));
        MoonRecipes.put(9 , Materials.Iron.getMolten(1000));
        MoonRecipes.put(10, Materials.Lanthanum.getMolten(1000));
        MoonRecipes.put(11, Materials.Lead.getMolten(1000));
        MoonRecipes.put(12, Materials.Manganese.getMolten(1000));
        MoonRecipes.put(13, Materials.Molybdenum.getMolten(1000));
        MoonRecipes.put(14, Materials.Neodymium.getMolten(1000));
        MoonRecipes.put(15, Materials.Samarium.getMolten(1000));
        MoonRecipes.put(16, Materials.Silicon.getMolten(1000));
        MoonRecipes.put(17, Materials.Tin.getMolten(1000));
        MoonRecipes.put(18, Materials.Titanium.getMolten(1000));

        MoonRecipes.put(19, Materials.SaltWater.getFluid(1000));

        MoonRecipes.put(20, Materials.Chlorine.getGas(1000));
        MoonRecipes.put(21, Materials.Fluorine.getGas(1000));
        MoonRecipes.put(22, Materials.Helium_3.getGas(1000));
        MoonRecipes.put(23, Materials.Hydrogen.getGas(1000));
        MoonRecipes.put(24, Materials.Nitrogen.getGas(1000));
        MoonRecipes.put(25, Materials.Oxygen.getGas(1000));

        //T2 - Deimos - De
        Map<Integer,FluidStack> DeimosRecipes = new HashMap<>();
        DeimosRecipes.put(0 , Materials.Aluminium.getMolten(1000));
        DeimosRecipes.put(1 , Materials.Antimony.getMolten(1000));
        DeimosRecipes.put(2 , Materials.Arsenic.getMolten(1000));
        DeimosRecipes.put(3 , Materials.Calcium.getMolten(1000));
        DeimosRecipes.put(4 , Materials.Cerium.getMolten(1000));
        DeimosRecipes.put(5 , Materials.Cobalt.getMolten(1000));
        DeimosRecipes.put(6 , Materials.Copper.getMolten(1000));
        DeimosRecipes.put(7 , Materials.Draconium.getMolten(1000));
        DeimosRecipes.put(8 , Materials.Electrotine.getMolten(1000));
        DeimosRecipes.put(9 , Materials.Gadolinium.getMolten(1000));
        DeimosRecipes.put(10, Materials.Holmium.getMolten(1000));
        DeimosRecipes.put(11, Materials.Iron.getMolten(1000));
        DeimosRecipes.put(12, Materials.Lanthanum.getMolten(1000));
        DeimosRecipes.put(13, Materials.Lithium.getMolten(1000));
        DeimosRecipes.put(14, Materials.Neodymium.getMolten(1000));
        DeimosRecipes.put(15, Materials.Nickel.getMolten(1000));
        DeimosRecipes.put(16, Materials.Oriharukon.getMolten(1000));
        DeimosRecipes.put(17, Materials.Samarium.getMolten(1000));
        DeimosRecipes.put(18, Materials.Silicon.getMolten(1000));
        DeimosRecipes.put(19, Materials.Thaumium.getMolten(1000));
        DeimosRecipes.put(20, Materials.Tungsten.getMolten(1000));
        DeimosRecipes.put(21, Materials.Uranium.getMolten(1000));
        DeimosRecipes.put(22, Materials.Vanadium.getMolten(1000));
        DeimosRecipes.put(23, Materials.Vinteum.getMolten(1000));
        DeimosRecipes.put(24, Materials.Vyroxeres.getMolten(1000));
        DeimosRecipes.put(25, Materials.Zinc.getMolten(1000));

        DeimosRecipes.put(26, Materials.Chlorine.getGas(1000));
        DeimosRecipes.put(27, Materials.Fluorine.getGas(1000));
        DeimosRecipes.put(28, Materials.Hydrogen.getGas(1000));
        DeimosRecipes.put(29, Materials.Nitrogen.getGas(1000));
        DeimosRecipes.put(30, Materials.Oxygen.getGas(1000));

        //T2 - Mars - Ma
        Map<Integer,FluidStack> MarsRecipes = new HashMap<>();
        /*
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);
        MarsRecipes.put(, Materials.);

         */

        MarsRecipes.put(1, Materials.SaltWater.getFluid(1000));
        MarsRecipes.put(2, Materials.Chlorobenzene.getFluid(1000));

        MarsRecipes.put(3, Materials.Chlorine.getGas(1000));
        MarsRecipes.put(4, Materials.Fluorine.getGas(1000));
        MarsRecipes.put(5, Materials.Hydrogen.getGas(1000));
        MarsRecipes.put(6, Materials.Nitrogen.getGas(1000));
        MarsRecipes.put(7, Materials.Oxygen.getGas(1000));

        //T2 - Phobos - Ph
        Map<Integer,FluidStack> PhobosRecipes = new HashMap<>();
        /*
        PhobosRecipes.put(, Materials.);
        PhobosRecipes.put(, Materials.);
        PhobosRecipes.put(, Materials.);
         */

        //T3 - Callisto - Ca
        Map<Integer,FluidStack> CallistoRecipes = new HashMap<>();
        CallistoRecipes.put(1, Materials.Oxygen.getGas(1000));
        CallistoRecipes.put(2, Materials.LiquidAir.getFluid(1000));

        //T3 - Europa - Eu
        Map<Integer,FluidStack> EuropaRecipes = new HashMap<>();
        EuropaRecipes.put(1, Materials.SaltWater.getFluid(1000));
        EuropaRecipes.put(2, Materials.OilExtraHeavy.getFluid(1000));

        //T3 - Ross128b - Rb
        Map<Integer,FluidStack> Ross128bRecipes = new HashMap<>();
        Ross128bRecipes.put(1, Materials.Lava.getFluid(1000));
        Ross128bRecipes.put(2, Materials.NatruralGas.getGas(1000));
        Ross128bRecipes.put(3, Materials.OilExtraHeavy.getFluid(1000));

        //T4 - Io - Io
        Map<Integer,FluidStack> IoRecipes = new HashMap<>();
        IoRecipes.put(1, Materials.SulfuricAcid.getFluid(1000));
        IoRecipes.put(2, Materials.CarbonDioxide.getGas(1000));
        IoRecipes.put(3, Materials.Lead.getMolten(1000));

        //T4 - Mercury - Me
        Map<Integer,FluidStack> MercuryRecipes = new HashMap<>();
        MercuryRecipes.put(1, Materials.Iron.getMolten(1000));
        MercuryRecipes.put(2, Materials.Helium_3.getGas(1000));

        //T4 - Venus - Ve
        Map<Integer,FluidStack> VenusRecipes = new HashMap<>();
        VenusRecipes.put(1, Materials.SulfuricAcid.getFluid(1000));
        VenusRecipes.put(2, Materials.CarbonDioxide.getGas(1000));
        VenusRecipes.put(3, Materials.Lead.getMolten(1000));

        //T5 - Miranda - Mi
        Map<Integer,FluidStack> MirandaRecipes = new HashMap<>();
        MirandaRecipes.put(1, Materials.HydricSulfide.getGas(1000));

        //T5 - Oberon - Ob
        Map<Integer,FluidStack> OberonRecipes = new HashMap<>();
        OberonRecipes.put(1, Materials.CarbonMonoxide.getGas(1000));

        //T5 - Titan - Ti
        Map<Integer,FluidStack> TitanRecipes = new HashMap<>();
        TitanRecipes.put(1, Materials.Ethane.getGas(1000));
        TitanRecipes.put(2, Materials.Methane.getGas(1000));
        TitanRecipes.put(3, Materials.Deuterium.getGas(1000));
        TitanRecipes.put(4, Materials.Argon.getGas(1000));

        //T5 - Ross128ba - Ra
        Map<Integer,FluidStack> Ross128baRecipes = new HashMap<>();
        Ross128baRecipes.put(1, Materials.SaltWater.getFluid(1000));
        Ross128baRecipes.put(2, Materials.Helium_3.getGas(1000));
        Ross128baRecipes.put(3, WerkstoffLoader.Neon.getFluidOrGas(1000));
        Ross128baRecipes.put(4, WerkstoffLoader.Krypton.getFluidOrGas(1000));
        Ross128baRecipes.put(5, WerkstoffLoader.Xenon.getFluidOrGas(1000));

        //T6 - Proteus - Pr
        Map<Integer,FluidStack> ProteusRecipes = new HashMap<>();
        ProteusRecipes.put(1, Materials.Deuterium.getGas(1000));
        ProteusRecipes.put(2, Materials.Tritium.getGas(1000));
        ProteusRecipes.put(3, Materials.Helium_3.getGas(1000));
        ProteusRecipes.put(4, Materials.Ammonia.getGas(1000));

        //T6 - Triton - Tr
        Map<Integer,FluidStack> TritonRecipes = new HashMap<>();
        TritonRecipes.put(1, Materials.Ethylene.getGas(1000));
        TritonRecipes.put(2, Materials.Nitrogen.getGas(1000));

        //T7 - Makemake - MM
        Map<Integer,FluidStack> MakemakeRecipes = new HashMap<>();
        MakemakeRecipes.put(1, Materials.HydrofluoricAcid.getFluid(1000));

        //T7 - Pluto - Pl
        Map<Integer,FluidStack> PlutoRecipes = new HashMap<>();
        PlutoRecipes.put(1, Materials.Oxygen.getGas(1000));
        PlutoRecipes.put(2, Materials.Fluorine.getGas(1000));
        PlutoRecipes.put(3, Materials.Nitrogen.getGas(1000));
        PlutoRecipes.put(4, Materials.LiquidAir.getFluid(1000));

        //T8 - BarnardC - BC
        Map<Integer,FluidStack> BarnardCRecipes = new HashMap<>();
        BarnardCRecipes.put(1, Materials.OilExtraHeavy.getFluid(1000));

        //T8 - BarnardE - BE
        Map<Integer,FluidStack> BarnardERecipes = new HashMap<>();
        BarnardERecipes.put(1, Materials.LiquidAir.getFluid(1000));

        //T8 - BarnardF - BF
        Map<Integer,FluidStack> BarnardFRecipes = new HashMap<>();
        BarnardFRecipes.put(1, Materials.Tin.getMolten(1000));

        //T8 - TCetiE - TE
        Map<Integer,FluidStack> TCetiERecipes = new HashMap<>();
        TCetiERecipes.put(1, Materials.Hydrogen.getGas(1000));
        TCetiERecipes.put(2, Materials.OilExtraHeavy.getFluid(1000));

        //T10 - DeepDark - DD
        Map<Integer,FluidStack> DeepDarkRecipes = new HashMap<>();
        DeepDarkRecipes.put(1, Materials.Hydrogen.getGas(1000));
        DeepDarkRecipes.put(2, Materials.OilExtraHeavy.getFluid(1000));

        //T0
        VoidFliudRecipes.put("Ow", OverworldRecipes);
        VoidFliudRecipes.put("Ne", NetherRecipes);
        VoidFliudRecipes.put("TF", TwilightRecipes);
        VoidFliudRecipes.put("ED", TheEndRecipes);
        VoidFliudRecipes.put("EA", EndAsteroidRecipes);
        //T1
        VoidFliudRecipes.put("Mo", MoonRecipes);
        //T2
        VoidFliudRecipes.put("De", DeimosRecipes);
        VoidFliudRecipes.put("Ma", MarsRecipes);
        VoidFliudRecipes.put("Ph", PhobosRecipes);
        //T3
        VoidFliudRecipes.put("Ca", CallistoRecipes);
        VoidFliudRecipes.put("Eu", EuropaRecipes);
        VoidFliudRecipes.put("Rb", Ross128bRecipes);
        VoidFliudRecipes.put("Io", IoRecipes);
        VoidFliudRecipes.put("Me", MercuryRecipes);
        VoidFliudRecipes.put("Ve", VenusRecipes);
        VoidFliudRecipes.put("Mi", MirandaRecipes);
        VoidFliudRecipes.put("Ob", OberonRecipes);
        VoidFliudRecipes.put("Ti", TitanRecipes);
        VoidFliudRecipes.put("Ra", Ross128baRecipes);
        VoidFliudRecipes.put("Pr", ProteusRecipes);
        VoidFliudRecipes.put("Tr", TritonRecipes);
        VoidFliudRecipes.put("MM", MakemakeRecipes);
        VoidFliudRecipes.put("Pl", PlutoRecipes);
        VoidFliudRecipes.put("BC", BarnardCRecipes);
        VoidFliudRecipes.put("BE", BarnardERecipes);
        VoidFliudRecipes.put("BF", BarnardFRecipes);
        VoidFliudRecipes.put("TE", TCetiERecipes);
        VoidFliudRecipes.put("DD", DeepDarkRecipes);
    }
}
