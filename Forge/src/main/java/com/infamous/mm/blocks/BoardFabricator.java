package com.infamous.mm.blocks;

import net.minecraft.util.Icon;

import com.infamous.mm.core.Debug;
import com.infamous.mm.core.ParameterBuilder;
import com.infamous.mm.core.lib.BlockRef;
import com.infamous.mm.core.lib.BoardFabricatorInfo;
import com.infamous.mm.tile_entities.TileEntityMain;

public class BoardFabricator extends BaseSubBlock {
	private int subId;
	
	public BoardFabricator(){
		subId = BlockRef.subIdMap.get(BlockRef.BlockMainKeys[BoardFabricatorInfo.key]);
	}
	
	public void initialize(){
		Debug.log("Initializing Board Fabricator");
		super.init(BoardFabricatorInfo.UNLOCALIZED_NAME, BoardFabricatorInfo.TEXTURE, BoardFabricatorInfo.HARDNESS, BoardFabricatorInfo.MINX,BoardFabricatorInfo.MINY,BoardFabricatorInfo.MINZ,
				BoardFabricatorInfo.MAXX,BoardFabricatorInfo.MAXY, BoardFabricatorInfo.MAXZ, BoardFabricatorInfo.MATERIAL, BoardFabricatorInfo.RENDERMETHOD, this.subId, BoardFabricatorInfo.NAME);
	}
	public void onBlockPlacedBy(ParameterBuilder params){
		TileEntityMain te = (TileEntityMain) params.getWorld().getBlockTileEntity(params.getInt()[0], params.getInt()[1], params.getInt()[2]);
		te.setSubId(params.getItemStack().getItemDamage());
	}
	
	public Icon getBlockTexture(ParameterBuilder params){
		return params.getBlockMainInstance().boardfabicon;
	}
}
