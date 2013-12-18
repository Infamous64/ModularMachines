package com.infamous.mm.blocks;

import net.minecraft.util.Icon;

import com.infamous.mm.core.Debug;
import com.infamous.mm.core.ParameterBuilder;
import com.infamous.mm.core.lib.BlockRef;
import com.infamous.mm.core.lib.StripBoardStationInfo;
import com.infamous.mm.tile_entities.TileEntityMain;

public class StripBoardStation extends BaseSubBlock{
	private int subId;
	private Icon icon;
	
	
	public StripBoardStation(){
	subId = BlockRef.subIdMap.get(BlockRef.BlockMainKeys[StripBoardStationInfo.key]);
	}

	public void initialize(){
		Debug.log("Initializing Strip Board Station");
		super.init(StripBoardStationInfo.UNLOCALIZED_NAME, StripBoardStationInfo.TEXTURE, StripBoardStationInfo.HARDNESS, StripBoardStationInfo.MINX,StripBoardStationInfo.MINY,StripBoardStationInfo.MINZ,
				StripBoardStationInfo.MAXX,StripBoardStationInfo.MAXY, StripBoardStationInfo.MAXZ, StripBoardStationInfo.MATERIAL, StripBoardStationInfo.RENDERMETHOD, this.subId, StripBoardStationInfo.NAME);
	}
	public void onBlockPlacedBy(ParameterBuilder params){
		TileEntityMain te = (TileEntityMain) params.getWorld().getBlockTileEntity(params.getInt()[0], params.getInt()[1], params.getInt()[2]);
		te.setSubId(params.getItemStack().getItemDamage());
	}
	
	public Icon getBlockTexture(ParameterBuilder params){
		return params.getBlockMainInstance().sbsicon;
	}



}